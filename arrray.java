import java.util.Scanner;
public class arrray {
    public static void main(String args[]){
        int[][] Arr2d = new int[3][2];
        Scanner sc = new Scanner(System.in);

        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 2 ;j++){
                System.out.println("Enter value");
                Arr2d[i][j] = sc.nextInt();
            }
        }

        for(int i = 0;i < 3;i++){
            for(int j = 0;j < 2;j++){
                System.out.print(" " + Arr2d[i][j] + "  ");
            }
            System.out.println(" \n ");
               
        }
    }
}
