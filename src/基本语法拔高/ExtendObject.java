package 基本语法拔高;

public final class ExtendObject extends Main {
    public ExtendObject() {
        super();
    }

    // 使用Override来对类方法进行重写
    @Override
    public void run() {
        super.run();
        System.out.println("over ride run ");
    }

    // 如果一个父类不允许子类对它的某个方法进行覆写，可以把该方法标记为final。
    // 用final修饰的方法不能被Override
    // 用final修饰的变量不能被修改（类似常量const)
    // 类似 public final void run(){}
    //    因为所有的class最终都继承自Object，而Object定义了几个重要的方法：
    //      如果一个类不希望任何其他类继承自它，那么可以把这个类本身标记为final。用final修饰的类不能被继承：
    //  类似写法： public final class className{}
    //    toString()：把instance输出为String；
    //    equals()：判断两个instance是否逻辑相等；
    //    hashCode()：计算一个instance的哈希值。
    public static void main(String[] args) {
        ExtendObject test = new ExtendObject();
        test.run();
        final float PI = 3.14f;
        final int T = 24;
    }
}
