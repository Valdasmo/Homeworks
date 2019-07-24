package lt.bit.hw;

import java.util.Scanner;

public class op014 {
    public static void main(String args[]) {
        int a = 0, b = 1, c = 0, limit;
        Scanner scan = new Scanner(System.in);
        System.out.print("Upto how many digits ? ");
        limit = scan.nextInt();

        System.out.print("Fibonacci digits : " + a + "  " + b + "  ");
        c = a + b;

        limit = limit - 2;

        while (limit > 0) {
            System.out.print(c + "  ");
            a = b;
            b = c;
            c = a + b;
            limit--;
        }

    }
}
