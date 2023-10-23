import java.lang.Math;
public class MathMethods{


    public static void main(String[] args)
    {
        System.out.println(Math.min(1,2));
        System.out.println(Math.max(1,2));
        System.out.println(Math.floor(1.9)); //decrease it from 1.9 to 1.0
        System.out.println(Math.ceil(1.1));// increase it to from 1.1 to 2.0
        System.out.println(Math.sqrt(64));

        double randomNum1 = Math.floor(Math.random() * 7); //0.020121 -- 0.9
        double randomNum2 = Math.floor(Math.random() * 7); //0.020121 -- 0.9
        // System.out.println(randomNum);

        //1 -6
       
        double firstPlayer = randomNum1;
        double secondPlayer = randomNum2;
        System.out.println(firstPlayer);
        System.out.println(secondPlayer);
         if(firstPlayer > secondPlayer){
            System.out.println("First Player Is Win" + " " + firstPlayer);
         }
         else if(firstPlayer < secondPlayer){
            System.out.println("Second Player Is Win" + " " + secondPlayer);
         }
         else if(firstPlayer == secondPlayer){
            System.out.println(" First and Second Palyer Match Tai");
         }


    }
}