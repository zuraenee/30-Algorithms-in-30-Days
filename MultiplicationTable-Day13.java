import java.util.Scanner;
public class MultiplicationTable {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Enter multiplication table size : ");
            int x = scanner.nextInt();
            for(int i = 1; i <= x; ++i) {
                for(int j = 1; j <= i; ++j) {
                    System.out.print("" + i + "*" + j + "=" + i * j + " ");
                }

                System.out.println();
            }

        }
    }
