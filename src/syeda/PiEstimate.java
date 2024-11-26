/*
* Course: CSC-1110
* Lab 4 - PiEstimate
* Name: Ameera Syed
* Created 9/21/2024
*/

package syeda;
import java.util.Scanner;

public class PiEstimate {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Set width
        int width = -1;
        do {
            System.out.print("Enter the desired width: ");
            if (in.hasNextInt()) {
                width = in.nextInt();
                if (width <= 0) {
                    System.out.println("Invalid input. Please try again.\n");
                }
            }else{
                System.out.println("Invalid input. Please try again.\n");
                in.next();
            }
        }while (width <=0);

        //Diagram
        int pixelsIn = 0;
        for (int i = width; i>=0;i--){
            for (int j = width; j>=0;j--){
                if (Math.sqrt(i * i + j * j)<= width - 0.5){
                    pixelsIn ++;
                    System.out.print(" *");
                }
            }
            System.out.println();
        }

        //Estimate pi
        int widthSquared = width*width;
        double piEstimate = 4 * (pixelsIn / (double) (widthSquared));
        System.out.println("\n4 * " + pixelsIn + "/" + widthSquared + ": " + piEstimate);

        //Set min desired error
        System.out.print("Enter the minimum desired error for the estimate of PI: ");
        double minDesiredError;
        while (true){
            if (in.hasNextDouble()) {
                minDesiredError = in.nextDouble();
                break;
            }
            System.out.print("\nPlease enter a valid number.\n" +
                    "Enter the minimum desired error for the estimate of PI:");
            in.next();
        }

        //Estimate pi with width within error
        double posAwayFromPi = Math.PI + minDesiredError;
        double negAwayFromPi = Math.PI - minDesiredError;
        double errorPi = 0;
        int widthEstimate = 0;

        while (errorPi < negAwayFromPi || errorPi > posAwayFromPi){
            double errorPixelsIn = 0;
            widthEstimate ++;

            for (int i = 0; i<widthEstimate;i++) {
                for (int j = 0; j <widthEstimate; j++) {
                    if (Math.sqrt(i * i + j * j) <= widthEstimate - 0.5) {
                        errorPixelsIn++;
                    }
                }
            }
            errorPi = 4 * (errorPixelsIn/(double) (widthEstimate*widthEstimate));

            /*
            System.out.println("PI: " + errorPi);
            System.out.println("Width: " + widthEstimate);
            System.out.println("Pixels: " + errorPixelsIn);
            */
        }
        System.out.println("An estimate of " + errorPi + " was achieved with a width of " + widthEstimate + ".\n");
    }
}