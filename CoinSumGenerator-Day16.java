import java.util.Scanner;
public class coinSumGenerator {
    public static void main(String[] args){
        int[] coins = {1,2,5,10,20,50,100,200};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the amount of money you would like to generate the different ways to make : ");
        int num = scanner.nextInt();
        int[] ways = new int[num+1];
        ways[0] = 1;
        for(int i=0; i<coins.length; i++){
            for(int j=coins[i]; j<=num; j++){
                ways[j] += ways[j-coins[i]];
            }
        }
        System.out.println(ways[num]);
        }
    }

