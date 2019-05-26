package com.bigdata.ct.producer;

import com.bigdata.ct.producer.IO.LocalFileDataIn;
import com.bigdata.ct.producer.bean.LocalFileProducer;

import java.io.IOException;

/**
 * 启动对象
 */
public class Bootstrap {
    public static void main(String[] args) throws IOException {
        // 构建生产者对象
        LocalFileProducer fileProducer = new LocalFileProducer();
        fileProducer.setIn(new LocalFileDataIn("E:\\Documents\\github\\ct\\localfile\\contact.log"));
//        fileProducer.setOut(new LocalFileDataOut(path));

        // 生产数据
        fileProducer.producer();

        // 关闭生产者对象
        fileProducer.close();
    }
}
