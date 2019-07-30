package lt.bit.hw;

import java.util.Scanner;

//    BMI with scanner
public class OP007 {
    public static void main(String[] args) {
        bmi();
    }

    private static void bmi() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input weight in kg: ");
        int weight = input.nextInt();
        System.out.println("Input height in meters: ");
        double height = input.nextDouble();
        double bmi = weight / (height * height);
        System.out.format("BMI: %.2f%n", bmi);
    }


}
