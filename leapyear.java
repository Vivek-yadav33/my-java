import java.util.Scanner;
class leap{
    public static void main(String args[]){
        int yearInput;
         Scanner sc = new Scanner(System.in);
        System.out.println("Enetr year to check leap year or not!");
        yearInput = sc.nextInt();
        if((yearInput % 4 == 0 && yearInput % 100 != 0) || yearInput % 400 == 0){
            System.out.println(yearInput + " is leap year");
        }
        else
        {
            System.out.println(yearInput + " is not leap year");
        }

    }
} 