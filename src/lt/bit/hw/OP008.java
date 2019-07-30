package lt.bit.hw;

// Calculator w/o scanner
public class OP008 {
    public static void main(String[] args) {
        int a = 22;
        int b = 15;
        int c = 0;
        calculator(a, b, c);

    }

    private static void calculator(int a, int b, int c) {

        int add = a + b;
        int substract = a - b;
        int multiply = a * b;
        int divide = a / b;
        int reminder = a % b;
        boolean checkEqual = a == b;
        boolean checkMore = a > b;
        boolean checkLess = a < b;
        System.out.println("add: " + add);
        System.out.println("substract: " + substract);
        System.out.println("multiply: " + multiply);
        System.out.println("divide: " + divide);
        System.out.println("reminder: " + reminder);
        System.out.println("a = b? " + checkEqual);
        System.out.println("a > b? " + checkMore);
        System.out.println("a < b? " + checkLess);
        c = a & b;
        printBinary(a, 8);
        System.out.println("&");
        printBinary(b, 8);
        System.out.println("--------");
        printBinary(c, 8);
        System.out.println("a & b = " + c);
        c = a | b;
        printBinary(a, 8);
        System.out.println("|");
        printBinary(b, 8);
        System.out.println("--------");
        printBinary(c, 8);
        System.out.println("a | b = " + c);
        c = a ^ b;
        printBinary(a, 8);
        System.out.println("^");
        printBinary(b, 8);
        System.out.println("--------");
        printBinary(c, 8);
        System.out.println("a ^ b = " + c);
        c = ~a;
        printBinary(a, 8);
        System.out.println("~");
        System.out.println("--------");
        printBinary(c, 8);
        System.out.println("~a = " + c);
        c = a << 2;
        printBinary(a, 8);
        System.out.println("<<");
        System.out.println("--------");
        printBinary(c, 8);
        System.out.println("a << 2 = " + c);
        c = a >> 2;
        printBinary(a, 8);
        System.out.println(">>");
        System.out.println("--------");
        printBinary(c, 8);
        System.out.println("a >> 2 = " + c);
        c = a >>> 2;
        printBinary(a, 8);
        System.out.println(">>>");
        System.out.println("--------");
        printBinary(c, 8);
        System.out.println("a >>> 2 = " + c);


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
