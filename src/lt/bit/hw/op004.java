package lt.bit.hw;

import java.util.Scanner;

public class op004 {
    public static void main(String[] args) {
//        double pi = Math.PI;
        printPI();
        piScan();// input with scanner
    }

    private static void printPI() {

        System.out.format("Pi reiksme suapvalinta iki 5 skaiciu po kablelio = " + "%.5f%n", Math.PI);
        System.out.println("Nesuapvalinta Pi reiksme = " + Math.PI);

    }

    private static void piScan() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input Pi: ");
        String pi = input.next();
        if (pi.equals("pi")) {

            System.out.format("Pi reiksme suapvalinta iki 5 skaiciu po kablelio = " + "%.5f%n", Math.PI);
            System.out.println("Nesuapvalinta Pi reiksme = " + Math.PI);


        }
    }
}
