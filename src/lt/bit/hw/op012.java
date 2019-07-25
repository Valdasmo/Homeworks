package lt.bit.hw;

public class op012 {
    public static void main(String[] args) {
        int length = 10, width = 5, radius = 5;
        Double edgeOne = 20.0, edgeTwo = 10.0;
        areaCalculiator(length, width);
        areaCalculiator(edgeOne, edgeTwo);
        areaCalculiator(radius);
    }

    private static void areaCalculiator(int length, int width) {
        System.out.println("Rectangle surface area: " + length * width);
    }

    private static void areaCalculiator(double edgeOne, double edgeTwo) {
        System.out.println("Right triangle surface area: " + edgeOne * edgeTwo / 2);
    }
    private static void areaCalculiator(int radius) {
        System.out.println("Circle surface area: " + Math.PI * radius * radius);
    }

}
