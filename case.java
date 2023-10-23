import java.util.Scanner;
class A{
    public static void main(String args[]){
        int n1,n2;
        char a;
        System.out.println("Enter first number");
        Scanner fp=new Scanner(System.in);
        n1=fp.nextInt();
        System.out.println("Enter operator");
         String operator = fp.next();
        a = operator.charAt(0);
       
        switch(a){
case '+':
    System.out.println("Enter second number");
    n2=fp.nextInt();
    System.out.println("Addition of first and second number"+(n1+n2));
    break;
    case '-':
    System.out.println("Enter second number");
    n2=fp.nextInt();
    System.out.println("Substracation of first and second number"+(n1-n2));
    break;
    case '*':
    System.out.println("Enter second number");
    n2=fp.nextInt();
    System.out.println("Multipalication of first and second number"+(n1*n2));
    break;
    case '/':
    System.out.println("Enter second number");
    n2=fp.nextInt();
    System.out.println("Division of first and second number"+(n1/n2));
    break;
    case '%':
    System.out.println("Enter second number");
    n2=fp.nextInt();
    System.out.println("modul of first and second number"+(n1%n2));
    break;
default:
    System.out.println("invalid operatoe");
        }


    }
}