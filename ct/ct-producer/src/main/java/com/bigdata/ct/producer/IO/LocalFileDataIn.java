package com.bigdata.ct.producer.IO;

import com.bigdata.ct.common.bean.Data;
import com.bigdata.ct.common.bean.DataIn;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

/**
 * 本地文件输入
 */
public class LocalFileDataIn implements DataIn {
    private BufferedReader reader;

    public LocalFileDataIn(String path) {
        setPath(path);
    }

    public void setPath(String path) {

        try {
            reader = new BufferedReader(new InputStreamReader(new FileInputStream(path)));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public Object read(Object path) {
        return null;
    }

    public <T extends Data> List<T> read(Class<T> clazz) throws Exception {
        ArrayList<T> list = new ArrayList<T>();
        try {
            // 从数据文件中读取所有的数据
            String line = null;
            while ((line = reader.readLine()) != null){
                // 将数据转换为指定类型的对象，封装为集合返回
                T instance = clazz.newInstance();
                instance.setValue(line);
                list.add(instance);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        return list;
    }

    public void close() throws IOException {
        if (reader != null) {
            reader.close();
        }
    }
}
