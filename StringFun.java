// import java.lang.Object;
public class StringFun {
    String para = "This is a paragraph is in JAVA";
    public static void main(String[] args)
    {
        StringFun str = new StringFun();

        // string length() function
        System.out.println(str.para.length());

        // string upper case
        System.out.println(str.para.toUpperCase()); //ABCD



        // string lower case
        System.out.println(str.para.toLowerCase()); //abcd
        System.out.println("-----------------------");

        // string split() //convert it into an array    ['T','h','i'] / ['This', 'is', 'a', 'paragrapgh']
        // delemeter ("a")
        String[] strArr = str.para.split(""); //if delemter is (" ") whitespace(space), break string into words("Vivek") of array element
        // if delemter is ("") has no space, break string into letter(['v','i','v','e','k',' ','i','s', ' ']) of array element

        //foreach
        for(String arrEl : strArr)
        {
            System.out.println(arrEl);
        }


        //replace()  replace("paragraph", "heading") 
        //
        System.out.println(str.para.replace("is", "and"));
        System.out.println(str.para.replaceAll("is", "and"));

        //substring(1) //part of a string in a small word
        System.out.println("My name is Vivek".substring(1,5)); //substring() if it has 2 parameter then it will return a length
        // of end index -1 
        
    }
}
