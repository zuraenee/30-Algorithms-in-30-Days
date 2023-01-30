public class FixedArrays{

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter size of array 1 : ");
        int size1 = scanner.nextInt();
        System.out.println("Enter size of array 2 : ");
        int size2 = scanner.nextInt();
        int[] array1 = new int[size1];
        int[] array2 = new int[size2];
        int[] array3 = new int[size1 + size2];

        int i;
        for(i = 0; i < size1; ++i) {
            System.out.print("Enter the first array elements: ");
            array1[i] = scanner.nextInt();
            array3[i] = array1[i];
        }

        for(i = 0; i < size2; ++i) {
            System.out.print("Enter the second array elements: ");
            array2[i] = scanner.nextInt();
            array3[size1 + i] = array2[i];
        }

        System.out.print("The resulted array is : " + Arrays.toString(array3));
    }
}
