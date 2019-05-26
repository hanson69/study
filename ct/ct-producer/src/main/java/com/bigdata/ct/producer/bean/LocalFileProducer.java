package com.bigdata.ct.producer.bean;

import com.bigdata.ct.common.bean.DataIn;
import com.bigdata.ct.common.bean.DataOut;
import com.bigdata.ct.common.bean.Producer;

import java.io.IOException;
import java.util.List;

/**
 * 本地文件生产者
 */
public class LocalFileProducer implements Producer {
    private DataIn in;
    private DataOut out;
    private volatile boolean flag;

    public void setIn(DataIn in) {
        this.in = in;
    }

    public void setOut(DataOut out) {
        this.out = out;
    }

    /**
     * 生产数据
     */
    public void producer() {
        //读取通讯录数据

//        while ( flag ){
            try {
                List<Contact> contacts = in.read(Contact.class);
                for (Contact contact: contacts){
                    System.out.println(contact);
                }
            } catch (Exception e) {
                e.printStackTrace();
            }

            //从通讯录中随机查找2个电话号码（主叫，被叫）
            //生成随机的通话时间//生成随机的通话时长
            //生成通话记录
            //将通话记录刷写到数据文件中
//        }

    }

    /**
     * 关闭生产者
     * @throws IOException
     */
    public void close() throws IOException {
        if (in != null) {
            in.close();
        }

        if (out != null) {
            out.close();
        }
    }
}
