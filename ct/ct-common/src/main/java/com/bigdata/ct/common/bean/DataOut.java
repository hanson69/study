package com.bigdata.ct.common.bean;

import java.io.Closeable;

public interface DataOut extends Closeable {
    public void setPath(String path);
}