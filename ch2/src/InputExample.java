// package ch2.src;

import java.util.Scanner;;

public class InputExample {
    public static void main(String[] args) {
        // Scanner scan = new Scanner(System.in);
        System.out.println("あなたのお名前は?");

        Scanner scan = new Scanner(System.in);
        String name = scan.next();

        System.out.println(name + " さん、こんにちは。");

        scan.close();
    }
}
