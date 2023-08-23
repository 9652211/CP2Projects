import java.util.Scanner;

public class Calculator {
    

    public static void main(String []args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Want to crunch some numbers? Enter a number: ");
        int num1 = sc.nextInt();
        System.out.println("And then another: ");
        int num2 = sc.nextInt();
        System.out.println("Operator? ");
        sc.nextLine();
        String op = sc.nextLine();
        if(op.equals("+")) {
            System.out.println("Your answer is: "+ calculate(num1, num2, op));
            System.out.println("Would you like to calculate again?");
        } else if (op.equals("-")) {
            System.out.println("Your answer is: "+ calculate(num1, num2, op));
            System.out.println("Would you like to calculate again?");
        } else if (op.equals("*")) {
            System.out.println("Your answer is: "+ calculate(num1, num2, op));
            System.out.println("Would you like to calculate again?");
        } else if (op.equals("/")) {
            System.out.println("Your answer is: "+ calculate(num1, num2, op));
            System.out.println("Would you like to calculate again?");
        } else {
            System.out.println("No smert enough");
        }
        
    }

    public static double calculate(int val1, int val2, String op) {
        double result = 0.0;
        if(op.equals("+")) {
            result = val1 + val2;
        } else if (op.equals("-")) {
            result = val1 - val2;
        } else if (op.equals("*")) {
            result = val1 * val2;
        } else if (op.equals("/")) {
            result = val1 / val2;
        }
        return result;
    }
}