import java.util.Arrays;
import java.util.Scanner;
class insertionSort{

      static int[] insertionSort(int[] arr) {
        for(int i=1; i<arr.length; i++){
            int j=i;
            while (j>0 && arr[j-1]>arr[j]){
                int temp = arr[j];
                arr[j] = arr[j-1];
                arr[j-1] = temp;
                j--;
            }
        }
        return arr;
     }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the length of array you wish to sort out : ");
        int arrayLength = scanner.nextInt();
        int array[] = new int[arrayLength];
        for (int i = 0; i < arrayLength; i++) {
            System.out.print("Enter element to add into array : ");
            array[i] = scanner.nextInt();
            }
        System.out.println("Array before sorting : " + Arrays.toString(array));
        System.out.println("Array after sorting : " + Arrays.toString(insertionSort(array)));
    }

}
