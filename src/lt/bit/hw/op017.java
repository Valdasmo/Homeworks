package lt.bit.hw;

public class op017 {
    public static void main(String args[]) {

        int a;
        int b;
        for (a = 1; a <= 10; a++) {
            for (b = 1; b <= 10; b++) {
                System.out.format("%4d", a * b);
            }
            System.out.println();
        }
    }
}