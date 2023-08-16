public class ReturnExample {
    public static double calcAreaOfCircle(double radius) {
        double PI = 3.14;
        return radius * radius * PI;
    }

    public static void main(String[] args) {
        double circleArea = calcAreaOfCircle(2.5);
        System.out.println("円の面積は " + circleArea);
    }
}
