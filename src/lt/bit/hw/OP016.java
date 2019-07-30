package lt.bit.hw;
//Parašykite programą, kuri skaičiuoja visų lyginių skaičių sumą diapazone nuo 0 iki 1000.
// Turi būti panaudoti for, while ir do ... while ciklai.

public class OP016 {
    public static void main(String[] args) {
        int sumByFor = 0;
        int sumByWhile = 0;
        int sumByDoWhile = 0;
        int j = 0;
        int k = 0;

        System.out.println("Sum calculation with 'for':");
        for (int i = 0; i <= 1000; i = i + 2) {
            sumByFor += i;
        }
        System.out.println(sumByFor);


        System.out.println("Sum calculation with 'while':");
        while (j <= 1000) {
            sumByWhile += j;
            j = j + 2;
        }
        System.out.println(sumByWhile);

        System.out.println("Sum calculation with 'do ... while':");
        do {sumByDoWhile += k;
            k = k + 2;
        }
        while (k <= 1000);
        System.out.println(sumByDoWhile);
    }

}