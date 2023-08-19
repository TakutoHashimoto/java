// package ch3.src;

public class LogicalSumExample {
    public static void main(String[] args) {
        int age = 20;

        if (age < 13 || 65 <= age) {
            System.out.println("入場料は無料です");
        } else {
            System.out.println("料金が必要です");
        }
    }
}
