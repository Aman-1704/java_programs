package L3_practice;

public class pattern4 {
    public static void main(String[] args) {
        int n=5;
        int nst=n;
        int row=1;
        while (row<=n) {
            int col=1;
            while (col<=nst) {
                System.out.print("*");
                col+=1;
            }
            System.out.println();
            row+=1;
            nst-=1;
        }
    }
}
