// package ch2.src;

public class TypeExample2 {
    public static void main(String[] args) {
        double d = 9.8;
        // int i = d;  これではコンパイルエラーが出る
        int i = (int)d;

        System.out.println("dの値は " + d);
        System.out.println("iの値は " + i);
    }
}