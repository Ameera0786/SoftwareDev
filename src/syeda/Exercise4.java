/*
 * Course: CSC-1110
 * Fall 2024
 * Exercise 4 - Right Triangle Math
 * Name: Ameera Syed
 * Last Updated: 9/20/2024
 */

package syeda;

/**
 * This class generates two random whole numbers between 1 and 10 and
 * uses those values as the two legs of a right triangle. It then
 * calculates the hypotenuse and the remaining two angles and
 * displays them.
 */
public class Exercise4 {
    private static final double RIGHT_ANGLE = 90.0;
    public static void main(String[] args) {
        // randomly choose side a
        double a = generateSide();
        // randomly choose side b
        double b = generateSide();
        // calculate hypotenuse
        double h = calculateHypotenuse(a, b);
        // calculate angle ah
        double angleAH = calculateAngle(a, h);
        // calculate angle bh
        double angleBH = RIGHT_ANGLE - angleAH;
        // report using printf
        report(a, b, h, angleAH, angleBH);
    }

    private static int generateSide() {
        return (int)(Math.random() * 10 + 1);
    }

    private static double calculateHypotenuse(double a, double b) {
        return Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
    }

    private static double calculateAngle(double x, double h) {
        return Math.acos(x/h);
    }

    private static void report(double a, double b, double h, double angleAH, double angleBH) {
        System.out.printf("a=%.1f, b=%.1f, h=%.2f\n" +
                "ah=%.2f, bh=%.2f, ab=90.0",a,b,h,angleAH,angleBH);
    }
}
