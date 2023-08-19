interface HasGetAreaMethod {
    double getArea();  // 面積を返す
}

abstract class Shape {
    abstract void draw();
}

class Rectangle extends Shape implements HasGetAreaMethod {
    // 長方形を描画する
    void draw() {
        System.out.println("◻︎");
    }

    public double getArea() {
        System.out.println("RectangleクラスのgetAreaメソッドが呼び出されました");
        return 1.0;
    }
}

class Circle extends Shape implements HasGetAreaMethod {
    // 円を描画する
    void draw() {
        System.out.println("o");
    }

    public double getArea() {
        System.out.println("CircleクラスのgetAreaメソッドが呼び出されました");
        return 1.0;
    }
}

class Polyline extends Shape {
    // 折れ線を描画する
    void draw() {
        System.out.println("N");
    }
}

class Polygon extends Shape implements HasGetAreaMethod {
    void draw() {
        System.out.println("凸");
    }

    public double getArea() {
        System.out.println("PolygonクラスのgetAreaメソッドが呼び出されました");
        return 1.0;
    }
}


public class PolymorphismExample2 {
    public static void main(String[] args) {
        HasGetAreaMethod[] closedShapes = new HasGetAreaMethod[3];
        closedShapes[0] = new Polygon();
        closedShapes[1] = new Rectangle();
        closedShapes[2] = new Circle();

        for (int i = 0; i < closedShapes.length; i++) {
            closedShapes[i].getArea();
        }
    }
}
