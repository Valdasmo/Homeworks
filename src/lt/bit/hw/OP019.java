package lt.bit.hw;

import java.util.Arrays;

//Parašykite programą, kuri sumuoja dviejų atsitiktinai sugeneruotų masyvų skaičius.
// Sumavimo rezultatas turi būti surašytas į trečią masyvą. Masyvai turi būti int tipo.
public class OP019 {
    public static void main(String[] args) {
        int[] firstArray = new int[10];
        int[] secondArray = new int[10];
        int[] sumArray = new int[10];

        for (int i = 0; i < firstArray.length; i++) {
            firstArray[i] = (int) (Math.random() * 100);
            secondArray[i] = (int) (Math.random() * 100);

        }
        System.out.println(Arrays.toString(firstArray));
        System.out.println(Arrays.toString(secondArray));

        for (int i = 0; i < sumArray.length; i++) {
            sumArray[i] = firstArray[i] + secondArray[i];
        }
        System.out.println(Arrays.toString(sumArray));

    }
}
