package 基本语法拔高;

import java.util.Arrays;
import java.util.Scanner;

public class Main2 {
    public int count;

    public static void main(String[] args) {
        // 使用yield 使得switch拥有一个返回值
        int option;

        Scanner scanner = new Scanner((System.in));
        option = scanner.nextInt();
        switch (option) {
            case 1:
                System.out.println("option = 1");
                break;
            case 2:
                System.out.println("option = 2");
                break;
            case 3:
                System.out.println("option = 3");
                break;
            default:
                System.out.println("option = else");
        }
        // for in 循环：
        int[] p = {1, 2, 3, 4, 6, 65, 8};
        System.out.println(Arrays.toString(p));
        Arrays.sort(p);
        for (int i : p) {
            System.out.println(i);
        }
    }
}
