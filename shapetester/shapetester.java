import java.util.Scanner;

public class shapetester {
    

    public static void main(String []args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("'Ello Earthlings!'");
        
        
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