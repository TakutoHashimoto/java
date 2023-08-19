public class StringExample {
    public static void main(String[] args) {
        String s1 = new String("こんにちは");
        String s2 = new String("こんにちは");
        System.out.println(s1 == s2);  // => false

        String str = "Javaの学習";

        System.out.println("===== length =====");
        System.out.println(str.length());  // => 7

        System.out.println("===== indexOf =====");
        System.out.println(str.indexOf("学習")); // => 5
        System.out.println(str.indexOf("Ruby"));  // => -1

        System.out.println("===== contains =====");
        System.out.println(str.contains("Java"));  // => true
        System.out.println(str.contains("Ruby"));  // => false

        System.out.println("===== replace =====");
        System.out.println(str.replace("Java", "Java言語"));  // => Java言語の学習

        System.out.println("===== split =====");
        String str2 = "2020/11/22";
        String[] items = str2.split("/");

        for (int i = 0; i < items.length; i++) {
            System.out.println(items[i]);
        }
        /* =>
        2020
        11
        22
        */
    }
}
