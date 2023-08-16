class StudentCard {
    int id;
    String name;
}


public class InstanceExample2 {
    public static void main(String[] args) {
        StudentCard a = new StudentCard();
        StudentCard b = new StudentCard();
        StudentCard c = b;

        a.id = 1234;
        a.name = "鈴木太郎";

        b.id = 1235;
        b.name = "佐藤花子";

        System.out.println("aのidは " + a.id + ", aのnameは " + a.name);
        System.out.println("bのidは " + b.id + ", bのnameは " + b.name);
        System.out.println("cのidは " + c.id + ", cのnameは " + c.name);

        System.out.println("====================");

        c.id = 1236;
        c.name = "山田二郎";

        System.out.println("aのidは " + a.id + ", aのnameは " + a.name);
        System.out.println("bのidは " + b.id + ", bのnameは " + b.name);
        System.out.println("cのidは " + c.id + ", cのnameは " + c.name);
    }
}
