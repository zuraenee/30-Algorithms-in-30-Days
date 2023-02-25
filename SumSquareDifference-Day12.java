public class sumSquareDifference {
    public static void sumSquareDifference(String[] args){
        int sumOfSquares = 0;
        int squareOfSum = 0, sum =0;
        for(int i=1; i<=100; i++){
            sumOfSquares += i*i;
            squareOfSum += i;
            sum = squareOfSum*squareOfSum;
        }
        System.out.println(sum-sumOfSquares);
    }
}
