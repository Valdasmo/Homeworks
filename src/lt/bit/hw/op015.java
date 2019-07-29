package lt.bit.hw;

public class op015 {
    public static void main(String[] args) {
        int y  = 0;
        calcFunction(y);
    }

    private static void calcFunction(int y) {
        System.out.println("Calculation y = x * 3");
        System.out.println("----------------------");
    for (int x=0; x<=10; x++){
        System.out.println("When x = " + x+ "   Y = " + (x*3));
    }

    }
}
