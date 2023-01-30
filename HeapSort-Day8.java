import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        //heap sort algorithm
        int[] arr = {1, 5, 3, 2, 4};
        System.out.println("Before Heap Sort : " + Arrays.toString(arr));
        heapSort(arr);
        System.out.println("After Heap Sort : " + Arrays.toString(arr));
    }

    public static void heapSort(int[] arr) {
        int n = arr.length;
        //build heap
        for (int i = n / 2 - 1; i >= 0; i--) {
            heapify(arr, n, i);
        }
        //extract elements from heap
        for (int i = n - 1; i >= 0; i--) {
            int temp = arr[0];
            arr[0] = arr[i];
            arr[i] = temp;
            heapify(arr, i, 0);
        }
    }

    public static void heapify(int[] arr, int n, int i) {
        int largest = i;
        int left = 2 * i + 1;
        int right = 2 * i + 2;
        if (left < n && arr[left] > arr[largest]) {
            largest = left;
        }
        if (right < n && arr[right] > arr[largest]) {
            largest = right;
        }
        if (largest != i) {
            int swap = arr[i];
            arr[i] = arr[largest];
            arr[largest] = swap;
            heapify(arr, n, largest);
        }
    }
}
