# 第5章 クラスの基本
## オブジェクト指向
* クラス
  * インスタンスがどのような情報と機能を持つかを定義したもの。
* インスタンス
  * クラスに定義された情報と機能を持つ、１つ１つの実体。

### クラスの宣言
* Javaでクラスを記述するときは、次のように書く。
    ```java
    [修飾子] class <クラス名> {
        // クラスの内容
    }
    ```
* `[修飾子]` には `public` などのキーワードが入る。
* クラスの内容には、**フィールド** と **メソッド** の宣言が含まれる。フィールドが情報、メソッドが機能に対応する。具体的には、フィールドは値を格納するための変数、メソッドは命令文をまとめたもの。
    ```java
    class <クラス名> {
        // フィールドの宣言
        // メソッドの宣言
    }
    ```

## クラスとインスタンス
### クラスの宣言
* `StudentCard` というクラスで、学生の学籍番号と氏名の情報を管理するものは次のように宣言する。
    ```java
    class StudentCard {
        int id;
        String name;
    }
    ```

### インスタンスの生成
* 前述の `StudentCard` クラスに基づいて、実際に学生の情報を格納するためのインスタンスを生成する。生成には `new` というキーワードを使う。
    ```java
    StudentCard a = new StudentCard();
    ```

### インスタンス変数
* インスタンスを生成した後、インスタンスが持つ変数に値を代入できる。
    ```java
    StudentCard a = new StudentCard();
    a.id = 1234;
    a.name = "鈴木太郎";
    ```
* `StudentCard` クラスのインスタンスを2つ生成し、それぞれに学籍番号と氏名を宣言する例（`InstanceExample.java`）
    ```java
    class StudentCard {
    int id;
    String name;
    }


    public class InstanceExample {
        public static void main(String[] args) {
            StudentCard a = new StudentCard();
            a.id = 1234;
            a.name = "鈴木太郎";
            System.out.println("aのidの値は " + a.id);
            System.out.println("aのnameの値は " + a.name);

            StudentCard b = new StudentCard();
            b.id = 1235;
            b.name = "佐藤花子";
            System.out.println("bのidの値は " + b.id);
            System.out.println("bのnameの値は " + b.name);
        }
    }
    ```
* `StudentCard` クラスの先頭に `public` がないが、これは1つのプログラムファイルには `public` のついたクラスを最大1つしか宣言できないというルールがあるため。