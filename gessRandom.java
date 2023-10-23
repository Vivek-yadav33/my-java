import java.util.Scanner;
import java.io.SyncFailedException;
import java.lang.Math;
public class gessRandom {
    double randomNum;
    int number,temp;

    // taking user input
    public void userInput()
    {
        System.out.println("Enter number to guess Range 1 to 10");
        Scanner sc = new Scanner(System.in);
        number =  sc.nextInt();
    }

    public void show(){
        //generating random number between 1 to 10
        randomNum = Math.ceil(Math.random() *10) ; //0.991
        System.out.println(randomNum);
        userInput();
            
        while(number != randomNum) //5 /!= 7
        {
            if(number > randomNum && number <= 10){
                System.out.println("your entered number is too high. ");
            }
            else if(number < randomNum ){
                System.out.println("your entered number is too low. ");

            }
            else{
                System.out.println("You entered a greater number than 10.....");
                System.out.println("Please Enter Number between Range 1 To 10");
            }

            userInput();

        }

        if(number == randomNum){
            System.out.println("You gess is right");
        }
        
    }

    public static void main(String args[]){
        gessRandom obj = new gessRandom();
        obj.show();
      
        
    }
}

// git add .
//git commit -m "added guess number code"
// git push origin master
// git log