package lt.bit.hw;

public class op008 {
    public static void main(String[] args) {
        calculator();

    }

    private static void calculator() {
        int a = 3;

        int b = 4;

        int c = 0;
//        double c = 2;
//        double d = 3;
        int add = a + b;
        int substract = a - b;
        int multiply = a * b;
        int divide = a / b;
//        double divideDouble = c / d;
        int reminder = a % b;
        boolean checkEqual = a == b;
        boolean checkMore = a > b;
        boolean checkLess = a < b;
//        System.out.println("add: " + add);
//        System.out.println("substract: " + substract);
//        System.out.println("multiply: " + multiply);
//        System.out.println("divide: " + divide);
//        System.out.println("divide: " + divideDouble);
//        System.out.println("reminder: " + reminder);
//        System.out.println("a = b? " + checkEqual);
//        System.out.println("a > b? " + checkMore);
//        System.out.println("a < b? " + checkLess);
        c = a & b;
        printBinary(a, 8);
        System.out.println("&");
        printBinary(b, 8);
        System.out.println("--------");
        printBinary(c, 8);
        System.out.println("a & b = " + c );
        c = a | b;
        System.out.println("a | b = " + c );
        c = a ^ b;
        System.out.println("a ^ b = " + c );
        c = ~a;
        System.out.println("~a = " + c );
        c = a << 2;
        System.out.println("a << 2 = " + c );
        c = a >> 2;
        System.out.println("a >> 2 = " + c );
        c = a >>> 2;
        System.out.println("a >>> 2 = " + c );


        }


    private static void printBinary(long value, long size) {
        for (long i = size - 1; i >= 0; i--) {
            long mask = 1 << i;
            long result = (mask & value) >> i;
            System.out.print(result);
        }
        System.out.println();
    }
}
