package lt.bit.hw;

import java.util.Scanner;

public class OP006 {
    public static void main(String[] args) {
        FtoCconverter();
    }

    private static void FtoCconverter() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Fahrenheit: ");

        int f = input.nextInt();
//    double f = 60; // ivedimas be skanerio
    double c = (f - 32) / 1.8;
        System.out.print(f + " Fahrenheit = ");
        System.out.format( "%.2f%n", c);
        System.out.print("Celsius");


    }
}
