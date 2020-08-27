package com.company;

public class EnumLearn {
    public static void main(String[] args) {
        //为了让编译器能自动检查某个值在枚举的集合内，
        // 并且，不同用途的枚举需要不同的类型来标记，
        // 不能混用，我们可以使用enum来定义枚举类：
        Weekday day = Weekday.FRI;
        //和int定义的常量相比，使用enum定义枚举有如下好处：
        //首先，enum常量本身带有类型信息，即Weekday.SUN类型是Weekday
        //使用enum定义的枚举类是一种引用类型。
        // 前面我们讲到，引用类型比较，要使用equals()方法，如果使用==比较，它比较的是两个引用类型的变量是否是同一个对象。
        // 因此，引用类型比较，要始终使用equals()方法，但enum类型可以例外。
        //这是因为enum类型的每个常量在JVM中只有一个唯一实例，所以可以直接用==比较：
        System.out.println(day == Weekday.MON); //false
        System.out.println(day == Weekday.FRI); //true
        //name返回常量名称
        System.out.println(Weekday.THU.name()); // THU
        //ordinal返回序号
        System.out.println(Weekday.THU.ordinal()); //4
    }
}

//注意到定义枚举类是通过关键字enum实现的，我们只需依次列出枚举的常量名。
enum Weekday {
    SUN, MON, TUE, WED, THU, FRI, SAT;
}