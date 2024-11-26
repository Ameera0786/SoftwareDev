/*
* Course: CSC-1110
* Lab 3 - Tax Filing
* Name: Ameera Syed
* Created 9/15/24
*/
package syeda;
import java.util.Scanner;

public class CalculateTaxes {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        //Joint or single filer and estimated income
        System.out.print("Are you a single filer or a married joint filer (enter 's' or 'j'): ");
        String filer = in.next();
        System.out.print("Enter an estimate of your earned income for 2024: ");
        int earned = in.nextInt();

        if (filer.equals("s")){
            single(earned);
        }else if (filer.equals("j")){
            joint(earned);
        }else{
            System.out.print("Program failed to complete b/c s or j was not entered. ");
        }
    }

    private static void single(int income){
        //Single filer rates + initialize
        final int RATE10S = 11600;
        final int RATE12S = 47150;
        final int RATE22S = 100525;
        final int RATE24S = 191950;
        final int RATE32S = 243725;
        final int RATE35S = 609350;
        final int RATE37S = 609351;
        int taxes = 0;

        // Check tax for when income is in the tax bracket
        if (income<= RATE10S){
            taxes += income * 0.10;
        }else if (income <= RATE12S){
            taxes += (income-RATE10S) * 0.12;
        }else if (income <= RATE22S){
            taxes += (income-RATE12S) * 0.22;
        }else if (income <= RATE24S){
            taxes += (income-RATE22S) * 0.24;
        }else if (income <= RATE32S){
            taxes += (income-RATE24S) * 0.32;
        }else if (income <= RATE35S){
            taxes += (income-RATE32S) * 0.35;
        }

        //Check tax for when income is greater than tax bracket.
        if (income > RATE10S){
            taxes += RATE10S * 0.10;
        }if (income > RATE12S){
            taxes += (RATE12S-RATE10S) * 0.12;
        }if (income > RATE22S){
            taxes += (RATE22S-RATE12S) * 0.22;
        }if (income > RATE24S){
            taxes += (RATE24S-RATE22S) * 0.24;
        }if (income > RATE32S){
            taxes += (RATE32S-RATE24S) * 0.32;
        }if (income > RATE35S){
            taxes += (RATE35S-RATE32S) * 0.35;
        }if (income > RATE37S){
            taxes += (income-RATE37S) * 0.37;
        }

        double rate = taxes * 1.0/(income * 1.0) * 100;
        System.out.println("Your estimated taxes for 2024 are : $" + taxes +
                "\nThis results in an " + rate + "% effective tax rate.");
    }private static void joint(int income){
        //Joint filer rates
        final int RATE10J = 23200;
        final int RATE12J = 94300;
        final int RATE22J = 201050;
        final int RATE24J = 383900;
        final int RATE32J = 487450;
        final int RATE35J = 731200;
        final int RATE37J = 731201;
        int taxes = 0;

        // Check tax for when income is in the tax bracket
        if (income<= RATE10J){
            taxes += income * 0.10;
        }else if (income <= RATE12J){
            taxes += (income-RATE10J) * 0.12;
        }else if (income <= RATE22J){
            taxes += (income-RATE12J) * 0.22;
        }else if (income <= RATE24J){
            taxes += (income-RATE22J) * 0.24;
        }else if (income <= RATE32J){
            taxes += (income-RATE24J) * 0.32;
        }else if (income <= RATE35J){
            taxes += (income-RATE32J) * 0.35;
        }

        //Check tax for when income is greater than tax bracket
        if (income > RATE10J){
            taxes += RATE10J * 0.10;
        }if (income > RATE12J){
            taxes += (RATE12J-RATE10J) * 0.12;
        }if (income > RATE22J){
            taxes += (RATE22J-RATE12J) * 0.22;
        }if (income > RATE24J){
            taxes += (RATE24J-RATE22J) * 0.24;
        }if (income > RATE32J){
            taxes += (RATE32J-RATE24J) * 0.32;
        }if (income > RATE35J){
            taxes += (RATE35J-RATE32J) * 0.35;
        }if (income > RATE37J){
            taxes += (income-RATE35J) * 0.37;
        }
        double rate = taxes * 1.0/(income * 1.0) * 100;
        System.out.println("Your estimated taxes for 2024 are : $" + taxes +
                "\nThis results in an " + rate + "% effective tax rate.");
    }
}


