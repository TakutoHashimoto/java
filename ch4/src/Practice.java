/* 
練習問題を解いたときのコード
*/

public class Practice {
    public static void printHello(int count) {
        // (1)
        for (int i = 1; i <= count; i++) {
            System.out.println("Hello");
        }
    }

    public static double getRectangleArea(double width, double height) {
        // (2)
        return width * height;
    }

    public static String getMessage(String name) {
        // (3)
        return "こんにちは " + name + " さん";
    }

    public static int getAbsoluteValue(int value) {
        // (4)
        if (value > 0) {
            return value;
        } else {
            return value * (-1);
        }
    }

    public static double getAverage(double a, double b, double c) {
        // (5)
        return (a + b + c) / 3.0;
    }

    public static boolean isSameAbsoluteValue(int i, int j) {
        // (6)
        return getAbsoluteValue(i) == getAbsoluteValue(j);
    }

    public static void main(String[] args) {
        printHello(3);
        System.out.println(getRectangleArea(2.5, 4.5));
        System.out.println(getMessage("hashimoto"));
        System.out.println(getAbsoluteValue(-3));
        System.out.println(getAverage(2, 4, 5));
        System.out.println(isSameAbsoluteValue(-3, 2));
    }
}
