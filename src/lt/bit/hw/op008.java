package lt.bit.hw;

public class op008 {
    public static void main(String[] args) {
        calculator();

    }

    private static void calculator() {
        int a = 2;
        int b = 3;
        double c = 2;
        double d = 3;
        int add = a + b;
        int substract = a - b;
        int multiply = a * b;
        int divide = a / b;
        double divideDouble = c / d;
        int reminder = a % b;
        boolean checkEqual = a == b;
        boolean checkMore = a > b;
        boolean checkLess = a < b;
        System.out.println("add: " + add);
        System.out.println("substract: " + substract);
        System.out.println("multiply: " + multiply);
        System.out.println("divide: " + divide);
        System.out.println("divide: " + divideDouble);
        System.out.println("reminder: " + reminder);
        System.out.println("a = b? " + checkEqual);
        System.out.println("a > b? " + checkMore);
        System.out.println("a < b? " + checkLess);


        }
}
