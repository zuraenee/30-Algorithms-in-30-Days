import java.util.Scanner;
import java.util.Random;
public class passwordGenerator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        System.out.print("Enter the length of the password : ");
        int lengthOfPasswords = scanner.nextInt();
        System.out.print("Enter the number of passwords you would like to generate : ");
        int numOfPasswords = scanner.nextInt();

        System.out.println("-----Passwords-----");
        for(int i=0; i<numOfPasswords; i++){
            System.out.println("Password " + (i+1) + ": ");
            for(int j=0; j<lengthOfPasswords; j++){ //j=j+4 because we want to add 4 characters to the password each time, not j++; or else it would be adding every 1
                selectTypeOfCharacter();
            }
            System.out.println();
        }
    }

    public static void selectTypeOfCharacter(){
        Random random = new Random();
        int randomCharacterNum = random.nextInt(3);
        int[] number = {1,2,3,4,5,6,7,8,9};
        int randomIndex = 0;
        String[] symbols = {"!","@","#","$","%","^","&","*","(",")","_","-","=","+","<",">","?","/","|",";",":"};
        String[] alphabet = {"a","b","c","d","e","f","g","h","i","j","k","l","m","n","o","p","q","r","s","t","u","v","w","x","y","z"};
        String[] alphabetUpper = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        if (randomCharacterNum == 0){
            randomIndex = random.nextInt(number.length);
            System.out.print(number[randomIndex]);
        }
        else if (randomCharacterNum == 1){
            randomIndex = random.nextInt(symbols.length);
            System.out.print(symbols[randomIndex]);
        }
        else if (randomCharacterNum == 2){
            randomIndex = random.nextInt(alphabet.length);
            System.out.print(alphabet[randomIndex]);
        }
        else if (randomCharacterNum == 3){
            randomIndex = random.nextInt(alphabetUpper.length);
            System.out.print(alphabetUpper[randomIndex]);
        }
    }
}
