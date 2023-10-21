package L2_practice;

public class pattern3 {
    public static void main(String[] args) {
        int n=5;

        int row=1;
        int nst=1;
        while (row<=n) {
            int col=1;
            while (col<=nst) {
                System.out.print("*");
                col+=1;
            }
            System.out.println();
            row+=1;
            nst+=1;
        }
    }
}
