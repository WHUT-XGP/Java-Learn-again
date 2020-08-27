package com.company;

import java.util.StringJoiner;

public class StringJoinerLearn {
    public static void main(String[] args) {
        // 第一个参数就是分隔符，第二个是开头，第三个是结尾
        StringJoiner sj = new StringJoiner(",", "Hello ", "!");
        String[] arr = {"ddd", "dasdsad", "dsad"};
        for (String temp : arr) {
            sj.add(temp);
        }
        System.out.println(sj.toString()); //Hello ddd,dasdsad,dsad!

        // String.join静态方法
        System.out.println(String.join(",", arr)); //ddd,dasdsad,dsad
    }
}
