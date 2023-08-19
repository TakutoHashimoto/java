// package ch2.src;

import java.util.Scanner;

public class InputExample2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("三角形の面積を計算します。");

        System.out.print("底辺の長さを入力してください: ");
        double base = scan.nextDouble();

        System.out.print("高さを入力してください: ");
        double height = scan.nextDouble();

        double area = base * height / 2.0;
        System.out.println("面積は " + area);

        scan.close();
    }
}
