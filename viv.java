import java.util.Scanner;
public class viv{
    static public void main(String args[]){
        int num, divNum = 2;
        int count = 0;
        System.out.println("Enter any number");
        Scanner obj=new Scanner(System.in);
        num = obj.nextInt();
        int temp = num;

        while(temp >= 2 )
        {
            if(num % divNum == 0) //
            {
                count++;
            }
            temp--;//
            divNum++; //
        }

        if(count == 1)
        {
            System.out.println(num + (" is prime number"));
        }
        else{
            System.out.println(num + (" is not prime number"));
        }
    }
}
