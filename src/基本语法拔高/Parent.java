package 基本语法拔高;

// 必须把一个父类本身定义成抽象类才能把方法定义成abstract方法

// 当一个具体的class去实现一个interface时，需要使用implements关键字。举个例子：

public abstract class Parent implements Person {
    @Override
    public void run() {
        System.out.println("run");
    }

    @Override
    public String name() {
        return "he";
    }

}
// 一个类只能继承自另一个类，不能从多个类继承。但是，一个类可以实现多个interface
//class Student implements Person, Hello { // 实现了两个interface
//    ...
//}