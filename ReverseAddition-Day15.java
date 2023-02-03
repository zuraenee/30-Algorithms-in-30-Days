import java.util.Scanner;
public class reverseAddition {

    static int reverseNum(int n){
        int reverseNum = 0, remainder = 0;
        while (n != 0) {
            remainder = n % 10;
            reverseNum = reverseNum * 10 + remainder;
            n /= 10;
        }
        return reverseNum;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int num1 = scanner.nextInt();
        int reversenum1 = reverseNum(num1);
        System.out.println("Enter second number: ");
        int num2 = scanner.nextInt();
        int reversenum2 = reverseNum(num2);
        int sum = reversenum1 + reversenum2;
        System.out.println("Sum of reversed numbers: " );
        System.out.println(sum);
    }
}
