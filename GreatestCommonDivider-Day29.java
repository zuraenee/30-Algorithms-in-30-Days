import java.util.InputMismatchException;
import java.util.Scanner; //we need to import the Scanner class in order to use it
public class SimpleErrorsinGCD {

    public void main(String[] args) {

        Scanner stdin = new Scanner(System.in); //Semicolon was missing at the end of the line
        System.out.print("Enter two numbers: ");

        try {
            int input1 = stdin.nextInt(); //For data type with method nextInt(), it should be int not double
            int input2 = stdin.nextInt(); //we need to use the () because nextInt() is a method

            int num1 = input1;
            int num2 = input2; //there was a typo in the variable name, it should be "input2" not "in2"

            int oldn1 = 0, oldn2 = 0; //we need to declare the variables oldn1 and oldn2 before using them
            while (num1 % num2 != 0) { //add the curly braces to the while loop to make it work
                oldn1 = num1;
                oldn2 = num2;
                num1 = oldn2;
                num2 = oldn1 % oldn2;
            }
            num2 = Math.abs(num2);
            System.out.println("The GCD of " + (int)input1 + " and " + (int)input2 + " is num2");//use concatenation to print the result and make sure to put (int) before the variables input1 and input2

        } catch (InputMismatchException e) { //don't forget to add "e" after the InputMismatchException in the catch block
            System.err.println("Error: input must be two numbers.");
            System.exit(1);
        }

    }
}
