package L2_practice;

public class pattern2 {
    public static void main(String[] args) {
        int n=4;

        //rows
        int row=1;

        while (row<=n) {
            //work
           int col = 1;
           while (col<=n) {
               System.out.print("*");
               col+=1;
           } 
        //changes 
           System.out.println();
           row+=1;
        }
    }
}
