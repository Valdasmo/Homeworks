package lt.bit.hw;

import java.util.Arrays;

//Parašykite programą, kuri rušiuoja String tipo masyvą.
public class OP020 {
    public static void main(String[] args) {
        String[] names = {"Jonas", "Birute", "Petras", "Ona", "Antanas", "Marija", "Arvydas", "Jekaterina"};
        System.out.println(Arrays.toString(names));
        for (int i = 0; i < names.length - 1; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].compareTo(names[j]) > 0) {
                    String temp = names[i];
                    names[i] = names[j];
                    names[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(names));
    }
}
