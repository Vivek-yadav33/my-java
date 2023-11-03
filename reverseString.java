public class reverseString {
    public static void main(String args[]){
        String str =  "hello";
        String []arr;
        arr= str.split("");
       
        for(int i = arr.length; i > 0 ; i--){
        
            System.out.print(arr[i-1]);
        }

        
    }
}
