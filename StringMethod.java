public class StringMethod {
    public static void main(String []args){
        String firstStr = "Vivek Yadav";
        String secondStr = "Vivek Yadav";
        System.out.println(firstStr.compareTo(secondStr));
        System.out.println(firstStr.equals(secondStr));
        
        System.out.println(firstStr.replaceAll("Vivek","Aman"));

        System.out.println(firstStr.replace("Yadav","Kumar"));


    }
}
