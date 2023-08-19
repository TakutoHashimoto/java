public class ExceptionExample2 {
    public static void main(String[] args) {
        int[] scores = new int[3];
        scores[0] = 50;
        scores[1] = 55;
        scores[2] = 70;
        // ArrayIndexOutOfBoundsExceptionが発生する
        scores[3] = 65;
    }
}
