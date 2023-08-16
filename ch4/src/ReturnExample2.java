public class ReturnExample2 {
    public static boolean isPositiveNumber(int i) {
        return i > 0;
    }

    public static void main(String[] args) {
        int i = -10;

        if (isPositiveNumber(i)) {
            System.out.println("iの値は正です");
        } else {
            System.out.println("iの値はマイナスまたはゼロです");
        }
    }
}
