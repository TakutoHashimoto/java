class StudentCard {
    int id;
    String name;

    StudentCard(int id, String name) {
        System.out.println("StudentCardクラスのコンストラクタが呼び出されました");
        this.id = id;
        this.name = name;
    }
}


public class ConstructorExample {
    public static void main(String[] args) {
        StudentCard a = new StudentCard(1234, "鈴木太郎");
        System.out.println("aのidの値は " + a.id);
        System.out.println("aのnameの値は " + a.name);
    }
}
