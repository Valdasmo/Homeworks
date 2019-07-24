package lt.bit.hw;

import java.util.Scanner;

public class op005 {
    public static void main(String[] args) {
//        int mass = 100;
//        weight(mass);
        massScan(); // input with scanner
    }
    private static void massScan() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input your mass: ");
        int mass = input.nextInt();
        System.out.format("Weight on the Mercury: %.2f%n", (mass * 3.701));
        System.out.format("Weight on the Venus: %.2f%n", (mass * 8.87));
        System.out.format("Weight on the Earth: %.2f%n", (mass * 9.81));
        System.out.format("Weight on the Mars: %.2f%n", (mass * 3.69));
        System.out.format("Weight on the Jupiter: %.2f%n", (mass * 23.12));
        System.out.format("Weight on the Saturn: %.2f%n", (mass * 8.96));
        System.out.format("Weight on the Uranus: %.2f%n", (mass * 8.69));
        System.out.format("Weight on the Neptune: %.2f%n", (mass * 11.15));
    }


    private static void weight(int mass) {
        System.out.format("Weight on the Mercury: %.2f%n", (mass * 3.701));
        System.out.format("Weight on the Venus: %.2f%n", (mass * 8.87));
        System.out.format("Weight on the Earth: %.2f%n", (mass * 9.81));
        System.out.format("Weight on the Mars: %.2f%n", (mass * 3.69));
        System.out.format("Weight on the Jupiter: %.2f%n", (mass * 23.12));
        System.out.format("Weight on the Saturn: %.2f%n", (mass * 8.96));
        System.out.format("Weight on the Uranus: %.2f%n", (mass * 8.69));
        System.out.format("Weight on the Neptune: %.2f%n", (mass * 11.15));


    }

}

