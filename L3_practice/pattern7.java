package L3_practice;

public class pattern7 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int nst=n;
        int nsp=0;
        while (row<=n) {
            int csp=1;
            while (csp<=nsp) {
                System.out.print(" ");
                csp+=1;
            }
            int cst=1;
            while (cst<=nst) {
                System.out.print("*");
                cst+=1;
            }
            System.out.println();
            row+=1;
            nsp+=2;
            nst-=1;

        }
    }
}
