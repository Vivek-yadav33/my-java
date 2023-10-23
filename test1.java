import java.util.Scanner;
class test{
	public static void main(String args[])
	{
		int count=0,num,i=2;
		Scanner sc = new Scanner(System.in);
		num=sc.nextInt();
		while(num>=i){
			if(num%i==0){
			count++;
			}
			
			i++;

		}
	if(count==1){
		System.out.println("Entred number is prime");
	}
	else{
		System.out.println("Entred number is not prime");
	}
	}
}