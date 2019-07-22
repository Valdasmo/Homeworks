package lt.bit.hw;

public class op002 {
    public static void main(String[] args) {
        printPI();
    }


    private static void printPI() {
        double pi = Math.PI;
        System.out.format("Pi reiksme suapvalinta iki 5 skaiciu po kablelio = " + "%.5f%n", pi);
        System.out.println("Nesuapvalinta Pi reiksme = " + pi);

    }
}
