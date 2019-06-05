package com.bigdata.ct.producer.bean;

public class Calllog {
    private String call1;
    private String call2;
    private String time;
    private String duration;

    public Calllog(String call1, String call2, String time, String duration) {
        this.call1 = call1;
        this.call2 = call2;
        this.time = time;
        this.duration = duration;
    }

    public String getCall1() {
        return call1;
    }

    public String getCall2() {
        return call2;
    }

    public String getTime() {
        return time;
    }

    public String getDuration() {
        return duration;
    }

    public void setCall1(String call1) {
        this.call1 = call1;
    }

    public void setCall2(String call2) {
        this.call2 = call2;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return call1 + "\t" + call2 + "\t" + time + "\t" + duration;
    }
}
