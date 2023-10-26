public class findLongestString {
    public static void main(String args[]){
        String fullName = "Vivek Kumar Yaduvanci";
        String[] nameArr = fullName.split("");
        
        Stirng[] longString = "";
        for(int i = 0; i < nameArr.length;i++){
            if(nameArr[i].length() > nameArr[i+1].length()){
                longString[i] = nameArr[i];
            }
            System.out.println(nameArr[i]);
        }
    }
    
}