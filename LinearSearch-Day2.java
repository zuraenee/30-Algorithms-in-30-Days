import java.util.Arrays;
import java.util.Scanner;
public class LinearSearcho{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements in the array you want to insert : ");
        int numberOfElements = sc.nextInt();
        int[] arr = new int[numberOfElements];
        System.out.println("-----Enter the elements of the array-----");
        for (int i = 0; i<=numberOfElements-1; i++) {
            System.out.print("Enter the element at index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.println("Array : " + Arrays.toString(arr));
        System.out.println("What is the element you want to search for?");
        int element = sc.nextInt();
        int arrLength = arr.length;

        System.out.println(linearSearch(arr, element, arrLength));
    }
    static String linearSearch(int arr[], int element, int arrLength){//the String is the output of the method
        for(int i=0; i<arrLength; i++){
            if(arr[i] == element){
                return "Element found at index " + i;
            }
        }
        return "Element not aaaa found";
    }
}
