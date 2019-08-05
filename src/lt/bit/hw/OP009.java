package lt.bit.hw;

import java.util.Scanner;

//    Calculator with scanner
public class OP009 {
    public static void main(String[] args) {
        calculator();
    }

    private static void calculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number a: ");
        int a = input.nextInt();
        System.out.println("Input number b: ");
        int b = input.nextInt();
        System.out.println("Input operation(+, -, *, /): ");
        String operation = input.next();
        switch (operation) {
            case ("+"):
                System.out.println("add: " + (a + b));
                break;
            case ("-"):
                System.out.println("substract: " + (a - b));
                break;
            case ("*"):
                System.out.println("multiply: " + (a * b));
                break;
            case ("/"):
                System.out.println("divide: " + (a / b));
                break;
            default:
                System.out.println("Wrong operation!");
                break;
        }
    }
}








