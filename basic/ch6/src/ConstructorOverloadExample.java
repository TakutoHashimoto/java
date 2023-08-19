class StudentCard {
    int id;
    String name;

    StudentCard() {
        System.out.println("引数のないコンストラクタが実行されました");
        this.id = 0;
        this.name = "未定";
    }

    StudentCard(String name) {
        System.out.println("引数が1つのコンストラクタが実行されました");
        this.id = 0;
        this.name = name;
    }

    StudentCard(int id, String name) {
        System.out.println("引数が2つのコンストラクタが実行されました");
        this.id = id;
        this.name = name;
    }
}


public class ConstructorOverloadExample {
    public static void main(String[] args) {
        StudentCard a = new StudentCard();
        System.out.println("aのidは " + a.id + ", aのnameは " + a.name);

        StudentCard b = new StudentCard("鈴木太郎");
        System.out.println("bのidは " + b.id + ", bのnameは " + b.name);

        StudentCard c = new StudentCard(1235, "佐藤花子");
        System.out.println("cのidは " + c.id + ", cのnameは " + c.name);
    }
}
