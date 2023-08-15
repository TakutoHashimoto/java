// package ch3.src;

public class SwitchExample2 {
    public static void main(String[] args) {
        int score = 3;

        switch(score) {
        case 1:
        case 2:
            System.out.println("もっと頑張りましょう");
            break;
        case 3:
        case 4:
        case 5:
            System.out.println("合格です");
            break;
        default:
            System.out.println("想定されていない点数です");
            break;
        }
        System.out.println("switchブロックを抜けました");
    }
}
