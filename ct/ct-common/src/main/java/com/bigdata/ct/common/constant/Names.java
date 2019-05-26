package com.bigdata.ct.common.constant;

import com.bigdata.ct.common.bean.Val;

/**
 * 名称常量枚举类
 */
public enum Names implements Val {
    NAMESPACE("ct");

    private final String name;

    private Names(String name) {
        this.name = name;
    }


    public void setValue(Object value) {

    }

    public Object getValue() {
        return null;
    }
}
