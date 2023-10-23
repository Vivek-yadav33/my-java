import java.util.Scanner;
class student{
    String studentName;
    int rollNum;
    int englishMarks,hindiMarks,mathMarks,scienceMarks,pysicsMarks;
    Scanner sc = new Scanner(System.in);
    void setdetail(){
        System.out.println("Enter Student name:");
        studentName =  sc.nextLine();
        System.out.println("Enter Student Roll Number:");
        rollNum= sc.nextInt();
        System.out.println("Enter Student Mathmatics Number");
        mathMarks =  sc.nextInt();
        System.out.println("Enter Student Science Number:");
        scienceMarks = sc.nextInt();
        System.out.println("Enter Student Hindi Number:");
        hindiMarks = sc.nextInt();
        System.out.println("Enter Student English Number:");
        englishMarks = sc.nextInt();
        System.out.println("Enter Student Pyshics Number:");
        pysicsMarks = sc.nextInt();
       



    }
    void getdetail(){
        System.out.println("* * * * * * * * * * * * * * * *");
    System.out.println("Student Name :" + studentName);
    System.out.println("Student Roll Number : " + rollNum);
    System.out.println("Student Hindi Marks: " + hindiMarks);
    System.out.println("Student English Marks: " + englishMarks);
    System.out.println("Student Mathematics Marks: " + mathMarks);
    System.out.println("Student Science Marks: " + scienceMarks);
    System.out.println("Student Pysics Marks: " + pysicsMarks);
    System.out.println("* * * * * * * * * * * * * * * *");

    }
    void getGread()
    {
        float sumNum,persentFind;
        sumNum = hindiMarks + englishMarks + mathMarks + scienceMarks + pysicsMarks;
        persentFind=(sumNum/500)*100;
        System.out.println("Student prsentage: "+ persentFind+"%");
        if(persentFind>=90){
            System.out.println("you are passed by A+ Gread..");
        }
        else if(persentFind>=80){
             System.out.println("you are passed by A Gread..");
        }
         else if(persentFind>=70){
             System.out.println("you are passed by B+ Gread..");
        }
         else if(persentFind>=60){
             System.out.println("you are passed by B Gread..");
        }
         else if(persentFind>=50){
             System.out.println("you are passed by C Gread..");
        }
         else {
             System.out.println("you are Faild....");
        }
        
    }
    public static void main(String []args)
    {

        student obj = new student();
        obj.setdetail();
        obj.getdetail();
        obj.getGread();

    }
    

}