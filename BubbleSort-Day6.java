import java.util.Arrays;
import java.util.Scanner;
public class BubbleSort{
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

        System.out.println(BubbleSort(arr, element));
    }
    static String BubbleSort(int[]arr, int element){
        for(int i=1; i<arr.length; i++){
            for(int j=0; j<arr.length-i; j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return Arrays.toString(arr);
    }
}
