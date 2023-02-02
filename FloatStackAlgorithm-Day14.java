import java.text.DecimalFormat;
import java.util.Scanner;
import java.util.Stack;

public class FloatStack
{

    private float[] aStack;
    int topOfStack;

    
    /**
     * Constructor for objects of class aStack
     */
    public FloatStack(int stackSizeIn)
    {
        // Creates a stack with maximum size stackSizeIn
        aStack = new float[stackSizeIn];
    }


    public void push(float dataIn)
    {
        // Adds the value data in to the stack
        if (topOfStack < aStack.length) {
            aStack[topOfStack] = dataIn;
            topOfStack++;
        }
        else {
            System.out.println("Error - stack full");
        }
    }
    
    public float pop(Stack<Float> myFloatStack) {
        // Removes the top item from the stack and returns it
        
        // Float.NaN is special value indicating that temp does not contain a floating point number
        // This is the value temp needs to contain if the stack is empty so a number cannot be popped
        float temp = Float.NaN;
        
        for(int i = 0; i < 5; i++)
        {
            float num = (float) myFloatStack.pop();
            System.out.println(num);
        }
        return temp;
    }
    
    public float top(Stack<Float> myFloatStack) {
        // Returns the top item on the stack, but does not remove it from the stack
        
        // Float.NaN is special value indicating that temp does not contain a floating point number
        // This is the value temp needs to contain if the stack is empty so there is no top number to return       
        float temp= Float.NaN;
        float element = (float) myFloatStack.peek();
        return temp;
    }
    

    public boolean empty(Stack<Float> myFloatStack) {
        // Modify this code so that it returns whether or not the stack is empty
        // rather than always returning false
        boolean x = false;
        if (myFloatStack.empty()) {
                    x = true;
                    System.out.println("Stack is empty");
                }
                else {
                    x = false;
                }
        return x;
    }
    
    private String padtoEightPlaces(float x) {
        // Not part of a normal stack
        // Prints a number in 8 places, 2 after the point
        // Used in outputing the contents of the stack in readable form
        DecimalFormat df = new DecimalFormat("#.00"); 
        String formatted =df.format(x);
        while (formatted.length() < 8)
            formatted = " " + formatted;
        return formatted;
    }
    
    public void printStack()
    {
        // For debugging only
        // Prints the contents of the stack in a more readable form
        System.out.println();
        System.out.println("    ----------");
        System.out.println("top |        |");
        System.out.println("    ----------");
        for (int i = topOfStack-1; i >= 0; i--) {
          System.out.println("    |"+padtoEightPlaces(aStack[i])+"|");
          System.out.println("    ----------");
        }
    }
    
    public static void main() {
        Scanner kbr = new Scanner(System.in);
        String option = "";
        float data;
        
        // Create a stack with maximum size given by user
        System.out.print("Maximum stack size? ");
        int maxStackSize = Integer.parseInt(kbr.nextLine());
        FloatStack myFloatStack = new FloatStack(maxStackSize);
        
        while (! option.equals("5")){
            // Allow user to test each of the stack methods
            System.out.println("Stack Demo");
            System.out.println("==========");
            System.out.println("1. Push number onto stack");
            System.out.println("2. Pop number from stack");
            System.out.println("3. Print number on top of stack");
            System.out.println("4. Check if stack is empty");
            System.out.println("5. Quit");
            System.out.print("Key in an option number and press the enter key: ");
            option = kbr.nextLine();
            System.out.println("--------------------------------------------------------");
            if (option.equals("1")) {
                System.out.print("Key in the number to push and press the enter key: ");
                data = Float.parseFloat(kbr.nextLine());
                myFloatStack.push(data);
            }
            else if (option.equals("2")) {
                System.out.println("The number popped from the stack was: " + myFloatStack.pop());
            }
            else if (option.equals("3")) {
                System.out.println("Number on top of stack is: " + myFloatStack.top());
            }
            else if (option.equals("4")) {
                if (myFloatStack.empty()) {
                    System.out.println("The stack is empty.");
                }
                else {
                    System.out.println("The stack is not empty.");
                }
            }
            else if (! option.equals("5")){
                 System.out.println(option + " is not a valid option");
            }
            System.out.println("--------------------------------------------------------");
            System.out.println("The stack now contains: ");
            myFloatStack.printStack();
            System.out.println("--------------------------------------------------------");
        }
        System.out.println(">>>>> The program has now finished <<<<<");
    }
}
