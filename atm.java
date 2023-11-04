import java.util.Scanner;

public class atm 
{
    Scanner sc = new Scanner(System.in);
    int atmPin,balEnter,pin = 1234,a = 1,totalBal =0,numInpu;
   
    //Check balance using pin 

    void checkBalInput()
    {


        System.out.println("Enter your 4 digit pin");
        atmPin = sc.nextInt();

        if(atmPin == pin)
        {
            if(a==3)
            {
                System.out.println("Your Account 24 hours blocks....................");
                System.out.println("Retry 24 hours after.............................");
            }
        }   
        else
        {
            System.out.println("Entered pin is not matched......................");

        }    

        if(a!=3)
        {
            if(atmPin >=1000 && atmPin <= 9999)
            {

                if(atmPin == pin)
                    {
                        System.out.println("Your account total balance: " + totalBal);
             
                    }

                 if(atmPin != pin)
                    {

                        while(a <3)
                            {
                
                                System.out.println("Entered pin is Rong ............\nPlease Enter valid pin.......");
                                atmPin = sc.nextInt();
                            
                        
                                if(a ==2)
                                    {
                                        System.out.println("Enter 3 times Rong pin....................................");
                                        System.out.println("24 hours block your account .............................");
                                    }
                                a++;
                                
                            }
                    }
            }

            else
            {
                System.out.println("Not enter 4 digit number ");
            }
        }
     

    }
    
    //ATM trow Balance Debit process


    void balDebit()

    {
        System.out.println("Enter your 4 digit pin");
        atmPin = sc.nextInt();

        if(atmPin == pin)
        {
            if(a==3)
            {

                System.out.println("Your Account 24 hours blocks............................");
                System.out.println("Retry 24 hours after.....................................");
            }
        }

        else
        {
            System.out.println("Entered pin is not matched......................");
            
        } 
        if(a!=3)
        {

            if(atmPin >=1000 && atmPin <= 9999)
            {

                //Check atm pin 

                if(atmPin == pin)
                
                {
                    System.out.println("Enter Debit Amount");
                    balEnter = sc.nextInt();


                    // check balance are less or equal total balance


                    if(balEnter <= totalBal)

                    {
                        System.out.println("Your Trancation is Complited........................");
                        totalBal -= balEnter; 

                    }
                    //Entered balance are greater then total balance

                    else if(balEnter > totalBal)
                    {

                        System.out.println("Entered amount is greater then................\n Total Balance is :" + totalBal );
                        System.out.println("Enter valid Balance: ");
                        balEnter = sc.nextInt();

                        if(balEnter <=totalBal)
                        
                        {
                            System.out.println("Your Trancation is Complited................");
                            totalBal -= balEnter; 
                        }


                    }
                }


                // if are atm pin rong input 

                if(atmPin != pin)

                {

                    while(a <3)
                    {
        
                        System.out.println("Entered pin is Rong ............\nPlease Enter valid pin.......");
                        atmPin = sc.nextInt();
                    
                
                        if(a ==2)

                        {
                            System.out.println("Enter 3 times Rong pin.............................");
                            System.out.println("24 hours block your account .............................");
                        }
                        a++;
                            
                    }
            }
                } 

            else

            {
                System.out.println("Not enter 4 digit number ");
            }
        }

    }

    // ATM pin change proccess

    void changePin()

    {
        if(atmPin == pin)
        {
            if(a==3)
            {

                System.out.println("Your Account 24 hours blocks....................");
                System.out.println("Retry 24 hours after.............................");
            }

        }

        else
        {
            System.out.println("Entered pin is not matched......................");
            
        } 

        if(a!=3)
        {

            System.out.print("Enter Old Pin: ");
            atmPin = sc.nextInt();

            if(atmPin == pin)

            {
            System.out.print("\n Enter New Pin : ");
            atmPin = sc.nextInt();
            pin = atmPin;
            System.out.println("ATM Pin Successfully Change................... ");


            }

            else if(atmPin != pin)

            {
                while(a <3)
                    {
        
                    System.out.println("Entered pin is Rong ............\nPlease Enter valid pin.......");
                    atmPin = sc.nextInt();
            
                    if(a ==2)

                    {
                        System.out.println("Enter 3 times Rong pin.............................");
                        System.out.println("24 hours block your account .............................");
                    }
                    a++;
                    
                 }
        }   }
    }


    void BalCredit(){
     
        System.out.println("Enter your 4 digit pin");
        atmPin = sc.nextInt();

       if(atmPin == pin)
       {

            if(a==3)

            {

                System.out.println("Your Account 24 hours blocks....................");
                System.out.println("Retry 24 hours after.............................");
            }
       }
       else
       {
           System.out.println("Entered pin is not matched......................");
           
       } 

        if(a!=3)
        {

            if(atmPin >=1000 && atmPin <= 9999)
            
            {
                if(atmPin == pin)

                {
                    System.out.println("Enter credit Amount");
                    balEnter = sc.nextInt();
                    totalBal += balEnter; 
                }
                if(atmPin != pin)
                {
                    while(a <3)
                    {
            
                        System.out.println("Entered pin is Rong ......................\nPlease Enter valid pin: ");
                        atmPin = sc.nextInt();
                    
                
                        if(a ==2)

                            {
                                System.out.println("Enter 3 times Rong pin.............................");
                                System.out.println("24 hours block your account .............................");
                            }

                            a++;
                                    
                    }
                }
            }

            else
            {
                System.out.println("Not enter 4 digit number ");
            }
        }

    }
    void userInput(){
        
        System.out.println("Press 1 to Check Balance................");
        System.out.println("Press 2 to debit Balance................");
        System.out.println("Press 3 to Credit Balance................");
        System.out.println("Press 4 to change ATM pin................");
        System.out.println("Press 0 to Exit...........................");

        numInpu = sc.nextInt();
    }
    public static void main(String args[])
    
    {

        atm obj = new atm();
        //  obj.balInput();
            
        
        boolean exit = false;

        obj.userInput();

        while(!exit)
        {
            switch(obj.numInpu)
            
            {
                case 1:
                    obj.checkBalInput();
                    obj.userInput();

                    break;
                case 2:
                    obj.balDebit();
                    obj.userInput();
                break;

                case 3:
                   obj.BalCredit();
                   obj.userInput();
                break;

                case 4:
                    obj.changePin();
                    obj.userInput();

                    break;

                case 0:
                    exit = true;
                    break;

                default:
                    System.out.println("Entered number is invalid ");
                    obj.userInput();

                    break;

            }
        }

    }
}
