 import java.util.Scanner;
class BankAccount
{
    private String customerName;
    private int accountNum;
    private int accountBal;
    private int phoneNum;
    private String email;
     Scanner obj = new Scanner(System.in);
    // getters methods
    public String getName()
    {
        return customerName;
    }

    // setters methods
    public void setName(String Name)
    {
        customerName = Name;
    }
    public void setEmail(String EmailId){
        email=EmailId;
    }
    public String getEmail(){
        return email;
    }
    public void setAccountNo(int setAcNo){
accountNum=setAcNo;
    }
    public int getAccountNo(){
        return accountNum;
    }
    public void setPhone(int phoneNumber){
        phoneNum=phoneNumber;
    }
    public int getPhone(){
        return phoneNum;
    }
    public void setAcBal(int acbalance){
        accountBal=acbalance;
    }
    public int  getAcBal(){
        return accountBal;
    }

    public void withdrawFunds(){
        System.out.println("Enter withdrawal Balance");
        int withBal = obj.nextInt();
        if(withBal<=accountBal){
            accountBal = this.accountBal - withBal;
            System.out.println("Entred withdrawl Ammount :" + withBal + "\n your withdrawal Succesfully Comliteed " );
            System.out.println("Avilable Balance in yuor Account: " + accountBal);
        }
        else{
            System.out.println("Low Balance please Enter valid Ammount" );
        }
    
        
        
    }
    public void depositFunds(){ 
       System.out.println("Enter Deposite Ammount");
       int depoBal=obj.nextInt(); 
       if(depoBal>0){
        this.accountBal = this.accountBal + depoBal;
        System.out.println("Deposite Ammount:" + depoBal );
       }
       else{
        System.out.println("You are input Invalid Balance Please Balance Valid Balance");
       }
        

    }
    public static void main(String[] args)
    {
        int bal,num,phone,option;
        String na,emailid;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter costumer name");
        na=sc.nextLine();
        System.out.println("Enter customer Email id");
        emailid=sc.nextLine();
        System.out.println("Enter customer Bank Acccount Number");
        num=sc.nextInt();
        System.out.println("Enter customer Phone Number");
        phone=sc.nextInt();
        System.out.println("Enter Account balance");
        bal=sc.nextInt();    
    
     
        System.out.println("Press 1 to deposite & Press 2 to Widraval");
        option=sc.nextInt();
        // object
        BankAccount bankAcc = new BankAccount();
        // deposite and withdrawal options
        if(option == 1){
            bankAcc.depositFunds();
        }
        else if(option == 2){
            bankAcc.withdrawFunds();
        }
        else{
             System.out.println();
        }
        bankAcc.setName(na);
        bankAcc.setEmail(emailid);
        bankAcc.setAccountNo(num);
        bankAcc.setPhone(phone);
        bankAcc.setAcBal(bal);
        System.out.println("Bank Hoder Name: " + bankAcc.getName());
        System.out.println("Bank Account Number: " + bankAcc.getAccountNo());
        System.out.println("Total Balance: " + bankAcc.getAcBal());
        System.out.println("Account Holder Email Id: " + bankAcc.getEmail());
        System.out.println("Acount Holder Phone Number: " + bankAcc.getPhone());
         
    } 
}