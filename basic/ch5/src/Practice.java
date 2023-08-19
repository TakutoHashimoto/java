/*
練習問題を解いたときのコード
*/

class Person {
    String name;  // 名前
    int age;      // 年齢
}


public class Practice {
    // 各設問のメソッドを追加
    static void printInfo(Person p) {
        // (1)
        System.out.println("名前: " + p.name);
        System.out.println("年齢: " + p.age);
    }

    static boolean ageCheck(Person p, int i) {
        // (2)
        return p.age > i;
    }

    static void printYoungPersonName(Person p1, Person p2) {
        // (3)
        if (p1.age <= p2.age) {
            System.out.println(p1.name);
        } else {
            System.out.println(p2.name);
        }
    }

    static int getTotalAge(Person p1, Person p2) {
        // (4)
        return p1.age + p2.age;
    }

    public static void main(String[] args) {
        Person a = new Person();
        a.name = "高橋太郎";
        a.age = 19;

        Person b = new Person();
        b.name = "小林花子";
        b.age = 18;

        // 追加したメソッドを呼び出す。戻り値がある場合はそれを出力する。
        printInfo(a);
        printInfo(b);
        System.out.println(ageCheck(a, 20));
        printYoungPersonName(a, b);
        System.out.println(getTotalAge(a, b));
    }
}
