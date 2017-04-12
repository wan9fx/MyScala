package org.stephen;

import java.sql.Timestamp;

/**
 * Created by wangfx on 2017/1/12.
 */
public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello new world!");
//        Hello hello = new Hello();
//        hello.sayHello("scala");


        Timestamp t = new Timestamp(System.currentTimeMillis());
        System.out.println(t);
    }
}
