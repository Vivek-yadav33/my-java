public class reverseString {
    public static void main(String args[]){
        String str =  "hello";
        String []arr;
        arr= str.split("");
       
        for(int i = arr.length; i > 0 ; i--){
        
            System.out.print(arr[i-1]);
            
        }
        int a=10,b=20,c=30;
        int num = (a>b) ?  (a > c ? a:c) :(b >c ? b:c);
        System.out.println(num);
    }
}
