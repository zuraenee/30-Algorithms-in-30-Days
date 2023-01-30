public class evenFibonacciSequence {
    public static int[] add(int n, int arr[], int x){
        int[] newarr = new int[n+1];
        for(int i=0; i<n;i++){
            newarr[i] = arr[i];
        }
        newarr[n] = x;
        return newarr;

    }
    public static void main(String[] args){
        int sumOfEven=0;
        int firstNumber = 1, secondNumber = 1, thirdNumber=0;
        int n = 4000000;
        for (int i=0; i<4000000; i++){
            thirdNumber = firstNumber+secondNumber;
            i=thirdNumber;
            firstNumber = secondNumber;
            secondNumber = thirdNumber;
            if(i%2==0){
                sumOfEven += i;
            }
            System.out.println(sumOfEven);
        }
    }
}
