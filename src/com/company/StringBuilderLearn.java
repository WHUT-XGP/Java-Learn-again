package com.company;

public class StringBuilderLearn {
    public static void main(String[] args) {
        //Java标准库提供了StringBuilder，它是一个可变对象，可以预分配缓冲区，
        // 这样，往StringBuilder中新增字符时，不会创建新的临时对象：
        // 参数为创建的预分配缓冲区大小
        // StringBuilder则没有实现线程安全功能，所以性能略高。
        // 如果你设置了1024 但使用 10244超过你的预设时 它会自动扩大
        // 初始的单位 比如你现在预计使用1024左右就 设置1024
        // 如果你设置了 102444 然后你使用的是1024左右 空间就浪费了
        StringBuilder sb = new StringBuilder(1024);
        for(int i=0;i<1000;i++){
            //可以进行链式操作
            sb
                    .append(i)
                    .append(',')
                    .append(".");
        }
        System.out.println(sb.toString());

        //StringBuffer是线程安全的，StringBuffer类中的方法都添加了synchronized关键字
        //给这个方法添加了一个锁，用来保证线程安全。api与StringBuider一致


    }
}