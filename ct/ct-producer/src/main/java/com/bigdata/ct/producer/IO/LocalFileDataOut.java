package com.bigdata.ct.producer.IO;

import com.bigdata.ct.common.bean.DataOut;

import java.io.*;

/**
 * 本地文件输出
 */
public class LocalFileDataOut implements DataOut {
    private PrintWriter writer;

    public LocalFileDataOut(String path) {
        setPath(path);
    }

    public void setPath(String path) {
        try {
            writer = new PrintWriter(new OutputStreamWriter(new FileOutputStream(path), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    public void write(Object data) {
        write(data.toString());
    }

    /**
     * 将数据字符串生成到文件中
     * @param data
     */
    public void write(String data) {
        writer.println(data);
        writer.flush();
    }

    public void close() throws IOException {
        writer.close();
    }
}
