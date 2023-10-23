import java.util.Scanner;
public class challenges {
    public boolean equal(String str1, String str2) {
        return str1.equals(str2);
    }
    public static void main(String args[]){
        // for phone number like this //****12
        // String num="12345";
        // String numArr="";
        // String numArrF=""; 

        // System.out.println(num.charAt(3));
        // for(int i=3;i<5;i++){
        //     numArr+=num.charAt(i);
        // }
        //   for(int i=0;i<3;i++){
        //     numArrF+=num.charAt(i);
        // }
        // int lenghtS=numArrF.length();
        // for(int j=0;j<lenghtS;j++){
        //     System.out.print("*");
        // }
        // System.out.print(numArr);

        //camel case string like this // thisIsAJavaLangauage   //This is a java language. 
        // substring(), split(" "), charAt()
        // String str = "This is a java language".toLowerCase();
        // String []strArr = str.split(" ");
        // String strCa = "";
        // String strWord = "";
        // for(int i = 0;i < 5;i++){
        //     if(i==0){
        //         strCa = strArr[i];
        //     }
        //     else{
        //         strWord += strArr[i].substring(0,1).toUpperCase()
        //             + strArr[i].substring(1);  
        //     }
        // }

        // String camelCase = strCa + strWord;
        // System.out.println(camelCase);
        
        //find the max length of word in an string //
        // String name1 = "Vivek yadav kuamr";
        // String[] name2=name1.split(" "); //name2["Vivek" "yadav"]
        // String name3 = "" ;
        // String name4 = "";
        // String name5 = "";
        
        // for(int i=0;i < name2.length;i++){
        //         if(i==0){
        //             name3 = name2[i];
        //         }
        //         if(i==1){
        //             name4 = name2[i];
        //         }
        //         if(i==2){
        //             name5 = name2[i];
        //         }
        // }
        // System.out.println(name3 + " " + name5 + " " + name4);
        
        // // finding the max element from an array [1,2,4,5,6,] output => 6
        // int[] numbers = {100,13,43,54,99,25,63,73,84,101}; //max num is 99
        // int numbersMax = numbers[0]; //100
        // for(int i = 0; i < 10;i++){  // 100
        //     if(numbersMax < numbers[i]){ //100 < 101
        //         numbersMax = numbers[i];//101
        //     }
        // }
        
        

        // System.out.println(numbersMax);
        // // findinig the min number in array 
        // System.out.println("---------------");
        // int numbersMin = numbers[0]; //100 //13 //
        // for(int i = 0;i<numbers.length;i++){
        //     if(numbersMin > numbers[i]){     // 100 > 100 //100 > 13 13 >43
        //         numbersMin = numbers[i];
        //     }
        // }
        // System.out.println(numbersMin);

        // take user input of char (1 letter) find the occurence in an string;
        // challenges chal = new challenges();
        // String str = "This is java programming language";
        // String strArr[] ={};
        // // chal.equal(str, "s");
        // for(int i = 0;i < str.length();i++){
        //     strArr = str.split("");
        // }
        // for(int j = 0;j < str.length(); j++){
        //     System.out.println(strArr[j]);
        // }
        // Scanner sc = new Scanner(System.in);
        // System.out.println("Enter Single character ");

        // char userInput = sc.next().charAt(0); //user input char to check
        // int count = 0;
        // for(int i = 0;i < str.length();i++){
        //     String charInput = chal.toString(userInput);
        //     if(chal.equal(strArr[i], charInput))
        //     {
        //         count += +1;
        //     }
        // }
        // System.out.println("Your input character found by " + count + " times");
        // if(chal.equal("v" ,chal.toString('v'))) 
        // {

        //     System.out.println(true);
        // }else{
        //     System.out.println(false);
        // }

        //find the max length word from the string //
        String st = "class and is used to compare two strings for equality educatio"; //programming
        String[] stArr = st.split(" ");
        String word = "";
        int wordLen = stArr[0].length(); //4
        
        for(int i = 0; i < stArr.length;i++){

            if(wordLen <= stArr[i].length()){ 
                word = stArr[i]; //programming
                wordLen = stArr[i].length();
            }
        }

        System.out.println("The max length is " + wordLen + " and word is : " + word );
    } 
}
