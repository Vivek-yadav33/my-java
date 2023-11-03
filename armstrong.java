import java.util.Scanner;;
public class armstrong {
    public static void main(String args[]){
        int userInput,temp,arm=0,s;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number to check armstrong or not!");
        userInput = sc.nextInt();
        temp = userInput;
        while(userInput >0){
            s = userInput %10; //153 % = 3
            arm = (s*s*s)+arm;
            userInput = userInput /10;
        }
        if(temp == arm){
            System.out.println(arm + " is Armstrong number");
        }
        else{
            System.out.println(temp + " is not Armstrong number");
        }
    }
}
