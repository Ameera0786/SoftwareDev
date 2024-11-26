package syeda;

import java.util.Scanner;
public class VariableNameChecker {
    public static void main(String[] args) {
        String variableName = "k";
        System.out.println("This program checks the properness of a proposed Java variable name:");
        do{
            String status = "Good.";
            System.out.println("Enter a variable name (q to quit): ");
            Scanner in = new Scanner(System.in);
            variableName = in.nextLine();
            for (int i = 0; i < variableName.length(); i++) {
                //All possible illegal solutions
                if (Character.isWhitespace(variableName.charAt(i)) ||
                        Character.isDigit(variableName.charAt(0)))
                {
                    status = "Illegal";
                    break;
                    //All possible good solutions
                }else if (!Character.isLowerCase(variableName.charAt(0)) ||
                        !Character.isLetterOrDigit(variableName.charAt(i)) &&
                                !status.equals("Illegal")){
                    status = "Legal, but uses poor style";
                }
            }
            if (!variableName.equals("q")){
                System.out.println(status);
            }
        }while (!variableName.equals("q"));
    }
}
