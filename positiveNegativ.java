import java.util.Scanner;
public class positiveNegativ {
    public static void main(String args[]){
        int userInput;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number to check positive or negative");

        userInput = sc.nextInt();
        if(userInput > 0){
            System.out.println("Your Entered number is positive");
        }
        else if(userInput < 0){
            System.out.println("Your Entered number is Negative");

        }
        else{
            System.out.println("You Enter 0 not positive or negative Number ");
            System.out.println("Reenter number");
            userInput = sc.nextInt();

        }
    }
}
