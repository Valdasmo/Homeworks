package lt.bit.hw;

public class OP013 {
    public static void main(String[] args) {
        factorial(20);

    }

    private static void factorial(int n) {
        long factNumber = 1;
        for (int i = 2; i <= n; i++) {
            factNumber *= i;
        }
        System.out.println(factNumber);
    }
}
