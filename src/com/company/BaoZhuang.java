package com.company;

public class BaoZhuang {
    public static void main(String[] args) {
        int i = 100;
        // 通过静态方法构造 Integer
        Integer n = Integer.valueOf(i);
        // 获取取值
        System.out.println(n); //100
        System.out.println(n.intValue());
    }
}
