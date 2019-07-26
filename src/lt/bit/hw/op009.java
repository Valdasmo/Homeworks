package lt.bit.hw;

import java.util.Scanner;

//    Calculator with scanner
public class op009 {
    public static void main(String[] args) {
        calculator();
    }

    private static void calculator() {
        Scanner input = new Scanner(System.in);
        System.out.println("Input number a: ");
        int a = input.nextInt();
        System.out.println("Input number b: ");
        int b = input.nextInt();
        System.out.println("Input operation: ");
        String operation = input.next();
        if ((operation.equals("+") | (operation.equals("-")) | (operation.equals("*")) | (operation.equals("/")))) {
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
            }

        } else {
            System.out.println("Wrong operation!"); //TODO
        }

    }
}








