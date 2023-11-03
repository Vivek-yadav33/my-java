import java.util.Scanner;
class strBuilder{
    public static void main(String args[]){
        StringBuilder str = new StringBuilder("Vivek yadav");
        // TO find enterd index character

        System.out.println(str.charAt(0));

        // To set One Character in enter index remove char exist index

        str.setCharAt(0, 'v');
        System.out.println(str);

        // Insert to char enter index 
        Scanner sc = new Scanner(System.in);
        str.insert(0,'a');
        System.out.println(str);


        // add end of string char or string
        str.append("kuamr");
        System.out.println(str);

        //delete string 
        str.delete(0,str.length());
        System.out.println(str);
         
        //append() use to input string or char end of string
        str.append("vivek");
        System.out.println(str);
        str.append(" kumar");
        str.append(" yadav");
        System.out.println(str);


    }
}