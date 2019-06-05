package com.bigdata.ct.producer;

import com.bigdata.ct.producer.IO.LocalFileDataIn;
import com.bigdata.ct.producer.IO.LocalFileDataOut;
import com.bigdata.ct.producer.bean.LocalFileProducer;

import java.io.IOException;

/**
 * 启动对象
 */
public class Bootstrap {
    public static void main(String[] args) throws IOException, InterruptedException {
        if( args.length < 2 ){
            System.out.println("执行出错，java -jar Producer.jar path1 path2");
            System.exit(1);
        }

        // 构建生产者对象
        LocalFileProducer fileProducer = new LocalFileProducer();
//        fileProducer.setIn(new LocalFileDataIn("E:\\Documents\\github\\ct\\localfile\\contact.log"));
//        fileProducer.setOut(new LocalFileDataOut("E:\\Documents\\github\\ct\\localfile\\call.log"));
        fileProducer.setIn(new LocalFileDataIn(args[0]));
        fileProducer.setOut(new LocalFileDataOut(args[1]));


        // 生产数据
        fileProducer.producer();

        // 关闭生产者对象
        fileProducer.close();
    }
}
