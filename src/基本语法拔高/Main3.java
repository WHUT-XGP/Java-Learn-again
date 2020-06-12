package 基本语法拔高;

public class Main3 {
    private int count = 1;
    private static int count2 = 0;

    public Main3() {
        System.out.println("constructor at count2 = " + count2);
    }
    public void setMain(String... names){

    }
    //可变参数 类型...
    private void showArgs(String... args) {
        for (String t : args) {
            System.out.println(t);
        }
    }

    public static void main(String[] args) {
        Main3 main = new Main3();
        Main3 main2 = new Main3();
        Main3 main3 = new Main3();
    }
}
