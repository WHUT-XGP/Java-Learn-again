package 基本语法拔高;

import jdk.nashorn.internal.objects.Global;

import java.util.Scanner;

public class Main {
    public void run(){
        System.out.println("test run ");
    }
    public static void main(String[] args) {
        // long占据8个字节同时赋值时必须在后面加上L符号作为标记
        long count = 110000000000000000L;
        // float类型必须加上f作为后缀
        float f_count = 1.486486f;
        // 在定义变量的时候如果加上一个final，那么这个变量就成了常量
        final double PI = 3.14;
        // PI=5;会报错 常量名一般全部大写

        // 有些时候变量的类型名称太长，可以用var代替(JAVA 10)特性

        // 变量自动提升和强制类型转换：
        short s = 1234;
        int i = 123456;
        int x = s + i; // s自动转型为int
        // 注意，无法逆字节转换，也就是不能int->short
        // short y = i + s; 报错
        // 强制进行类型转化：使用(类型名) 变量名 语法
        short y = (short) x;

        // Java允许使用中文变量
        int 数字 = 1;
        System.out.println(数字);
        System.out.println(count);

        // 浮点数无法精确计算，所以一般用绝对值进行判断 Math.abs()
        float f_x = 0.000001f;
        float f_y = 0.000001f;
        System.out.println(f_x - f_y < 0.00000001);
        double max = Global.Infinity;
        System.out.println(max); // Infinity

        //         多行字符串 JAVA 13
        //                String s = """
        //                        啊啊啊啊不要啊
        //                        """;

        //       Java的数组有几个特点：
        //    数组所有元素初始化为默认值，整型都是0，浮点型是0.0，布尔型是false；char默认是' '
        //    数组一旦创建后，大小就不可改变。
        char[] test = new char[512];
        System.out.println(test[0]);
        //    可以使用类似c++的写法
        int[] foo = {1, 2, 3, 5, 8, 6};
        System.out.println(foo.length);

        // 输入输出占位符处理
        double d = 1.568469;
        System.out.printf("含在这里%.2f\n", d);
        //%d	格式化输出整数
        //%x	格式化输出十六进制整数
        //%f	格式化输出浮点数
        //%e	格式化输出科学计数法表示的浮点数
        //%s	格式化字符串

        Scanner scanner = new Scanner(System.in);
        System.out.print("请输入string:");
        String name = scanner.nextLine();
        System.out.print("请输入int ");
        int id = scanner.nextInt();
        System.out.printf("%s,your id is %d", name, id);
    }
}
