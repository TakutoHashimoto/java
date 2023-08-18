class A {
    // コンストラクタ
    A() {
        System.out.println("A:引数のないコンストラクタが実行されました");
    }

    A(int x) {
        System.out.println("A:引数は1つのコンストラクタが実行されました");
    }
}


class B extends A {
    // デフォルトコンストラクタ
    // B() {
    //     super();
    // }
    B(int x) {
        // super(x);
        System.out.println("B:引数が1つのコンストラクタが実行されました");
    }
}


public class Sample {
    public static void main(String[] args) {
        // B b = new B(5);
        // => これはコンパイルエラーが出る（コンストラクタは継承されないため）

        B b = new B(5);
        // => これを実行すると、Bクラスにデフォルトコンストラクタが追加されたとみなしてコンパイルされる
        // （実際にコードが書き換わる訳ではない）
    }
}
