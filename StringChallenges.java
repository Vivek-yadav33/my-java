public class StringChallenges {

    // 1} "vivek" print it like this "Vivek"

    public int phone = 123456;
    public String phones;


    public static void main(String[] args)
    {
        String name = "vivek yadav";
        String firstLetter =  name.substring(0,1);
        String fletterName = firstLetter.toUpperCase();
        String lastLetter = name.substring(1);
        System.out.println(fletterName + lastLetter);
       
        String [] nameArr =  name.split("");//['v','i']
        String nameFirstLetter = "";
        String nameLetter = "";
        int a = name.length();

        for(int i = 0; i < 1; i++){
            nameFirstLetter = nameArr[i].toUpperCase();
        
        }

        System.out.println(a);

        for(int j = 1; j <= 10; j++){
            nameLetter += nameArr[j];
        }

        System.out.println( nameFirstLetter + nameLetter);

        //phone 123456 => output ****56 //use split("") and replace()
        // substring() and replace()
       
        StringChallenges strChall = new StringChallenges();
        String phoneArr = strChall.toString();
        //**** 56         */

        // String numArr[]=
        
    }
    // to convert an any data type into string
    public String toString()
    {
        return  "" + phone;
    }
}
