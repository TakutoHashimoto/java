// package ch3.src;

public class TimesTable {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            for (int j = 1; j < 10; j++) {
                int value = i * j;
                System.out.print(i + "x" + j + "=" + value);
                System.out.print(" ");
            }
            System.out.println("");
        }
    }
}
