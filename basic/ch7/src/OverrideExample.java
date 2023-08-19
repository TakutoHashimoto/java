public class OverrideExample {
    public static void main(String[] args) {
        System.out.println("===StudentCardクラスのインスタンス===");
        StudentCard a = new StudentCard();
        a.id = 1234;
        a.name = "鈴木太郎";
        a.printInfo();

        System.out.println("===IStudentCardクラスのインスタンス===");
        IStudentCard b = new IStudentCard();
        b.id = 2345;
        b.name = "John Smith";
        b.nationality = "イギリス";
        b.printInfo();
    }
}
