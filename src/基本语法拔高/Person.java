package 基本语法拔高;

// 如果一个抽象类没有任何字段，全都是抽象方法，就可以改写为interface(接口)
interface Person {
    void run();

    default void show() {
        System.out.println("hhhh");

    }

    String name();
}
