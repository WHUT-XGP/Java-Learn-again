package com.company;

import java.io.UnsupportedEncodingException;


public class LearnString {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // 一种char方法构造
        String s = new String(new char[]{'h', 'e', 'l', 'l', 'o'});
        System.out.println(s);
        // 子串判断
        System.out.println(s.contains("hel"));
        // 返回子串
        System.out.println(s.substring(2)); //llo
        // 返回数组第[2,4)个位置
        System.out.println(s.substring(2, 4)); //ll
        // indexOf方法
        System.out.println(s.indexOf('e')); //1
        System.out.println(s.indexOf('2')); // -1（失败返回）
        // lastIndexOf方法
        System.out.println(s.lastIndexOf('l')); //3
        // charAt获取位置串，注意一定不能是[3]
        System.out.println(s.charAt(3));
        // endWith和startsWith进行头部和尾部判断
        System.out.println(s.endsWith("lo"));
        System.out.println(s.startsWith("he"));
        //去除首尾空白，返回新串而非改变原串
        System.out.println("  he l lo   ".trim());
        // strip 也是去除首位空白,但是 类似中文的空格字符\u3000也会被移除
        System.out.println("  你是我的  打扫i大家   ".trim());
        System.out.println(" 泥是我的 代收代缴哦   ");
        // split分割字符
        String s1[] = "泥是？谁？啊？".split("？");
        System.out.println(s1[1]); // 谁
        //替换子串
        //要在字符串中替换子串，有两种方法。一种是根据字符或字符串替换：
        // 1 char替换
        System.out.println(s.replace('h', 'a'));//aello
        // 2 String替换
        System.out.println(s.replaceAll("ll", "aa")); //heaao
        // 这里的参数都是字符串
        System.out.println(s.replaceAll("l", "a"));//heaao
        //拼接字符串使用静态方法join()，注意是静态方法，它用指定的字符串连接字符串数组：
        System.out.println(String.join(" 你爱谁", s1));//泥是 你爱谁谁 你爱谁啊
        //字符串提供了format()静态方法，可以传入其他参数，替换占位符，然后生成新的字符串：
        System.out.println(String.format("你是%s,你今年%d岁了，你上学期的绩点是%.2f,你的绩点16进制是%x", "AX", 20, 4.5555, 0x4555));//你是AX,你今年20岁了，你上学期的绩点是4.56
        //自身可以调用formatted()方法 java13以上
        System.out.println("你是%s,你今年%d岁了，你上学期的绩点是%.2f");

        // 类型转化
        // 调用静态方法 String.valueOf
        System.out.println(String.valueOf(135));
        // 转换为其他类型
        int n1 = Integer.parseInt("4548");
        System.out.println(n1);
        boolean b1 = Boolean.parseBoolean("true");
        System.out.println(b1);
        double d1 = Double.parseDouble("1.3323");
        System.out.println(d1);
        // Integer有个方法叫getInteger(String)方法，它的作用是把系统变量转换为Integer
//        System.out.println(Integer.getInteger("java.version"));
        //转化为char[]
        System.out.println("hello".toCharArray());
        //从String的不变性设计可以看出，如果传入的对象有可能改变，我们需要复制而不是直接引用。
        //编码转换
        byte[] bs = "110".getBytes("utf8");
    }
}
