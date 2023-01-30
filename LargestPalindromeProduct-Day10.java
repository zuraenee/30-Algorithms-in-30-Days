public class largestPalindromeProduct {
    //The largest palindrome made from the product of two 2-digit numbers is 9009 = 91 × 99.
    //Find the largest palindrome made from the product of two 3-digit numbers.
    public static void main(String[] args) {
        int largestPalindrome = 0;
        for (int i=100; i<1000; i++) {
            for (int j = 100; j < 1000; j++) {
                int product = i * j;
                int reverseNum = 0, remainder = 0, originalNum = 0;
                originalNum = product;
                while (product != 0) {
                    remainder = product % 10;
                    reverseNum = reverseNum * 10 + remainder;
                    product /= 10;
                }
                if(reverseNum == originalNum){
                    if(originalNum>largestPalindrome){
                        largestPalindrome = originalNum;
                    }
                }
            }
        }
        System.out.println(largestPalindrome);
    }
}
