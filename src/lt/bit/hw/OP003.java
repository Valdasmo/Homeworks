package lt.bit.hw;

import java.util.Scanner;

public class OP003 {
    public static void main(String[] args) {
        int a = 2, b = 5;
        calcSquare(a, b);
        calcScaner();// input with scanner

    }

    private static void calcSquare(int a, int b) {
        System.out.println("Staciakampio perimetras = " + (a * 2 + b * 2));
        System.out.println("Staciakampio plotas = " + (a * b));
    }

    private static void calcScaner() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input a: ");
        int a = input.nextInt();
        System.out.println("Input b: ");
        int b = input.nextInt();
        System.out.println("Staciakampio perimetras = " + (a * 2 + b * 2));
        System.out.println("Staciakampio plotas = " + (a * b));

    }
}
