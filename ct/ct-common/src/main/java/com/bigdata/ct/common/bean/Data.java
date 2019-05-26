package com.bigdata.ct.common.bean;

public class Data implements Val {
    private Object content;

    public void setValue(Object value) {
        this.content = value;
    }

    public Object getValue() {
        return content;
    }
}
