package lt.bit.hw;


import java.lang.reflect.Array;
import java.util.Arrays;

public class OP010 {
    public static void main(String[] args) {
        arraySorting();

    }

    private static void arraySorting() {
        int[] numArray = new int[5];
        for (int i = 0; i < numArray.length; i++) {
            numArray[i] = (int) (Math.random() * 100);

        }
        System.out.println(Arrays.toString(numArray));
        Arrays.sort(numArray);
        System.out.println(Arrays.toString(numArray));
        int arraySum = 0;
        for (int i = 0; i<numArray.length; i++ ){
        arraySum +=numArray[i];
        }
        System.out.println(arraySum);
    }
}
