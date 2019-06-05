package com.bigdata.ct.producer.IO;

public class test {
    public static int res(int i) {
        if ( i == 1 || i == 0 ){
            return i;
        }else {
            return i * res(i - 1);
        }
    }
    static int mult = 1;
    public static void main(String[] args) {
        int j = 5;
        j = res(j);
        System.out.println(j);
    }
}
