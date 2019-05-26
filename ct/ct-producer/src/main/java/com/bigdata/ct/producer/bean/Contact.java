package com.bigdata.ct.producer.bean;

import com.bigdata.ct.common.bean.Data;

public class Contact extends Data {
    private String tel;
    private String name;

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void setValue(Object value) {
        String content = (String) value;
        String[] strings = content.split("\t");
        setName(strings[1]);
        setTel(strings[0]);
    }

    @Override
    public Object getValue() {
        return super.getValue();
    }

    @Override
    public String toString() {
        return "Contact{" +
                "tel='" + tel + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
