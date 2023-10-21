package L4_practice;

public class pattern18 {
    public static void main(String[] args) {
        int n=7;
        int row=1;
        int nsp=n/2;
        int nst=1;

        while (row<=n) {
            int csp=1;
            while (csp<=nsp) {
                System.out.print("  ");
                csp+=1;
            }
            int cst=1;
            while (cst<=nst) {
                System.out.print("* ");
                cst+=1;
            }
            System.out.println();
            if (row<=n/2) {
                nsp-=1;
                nst+=2;
            } else {
                nsp+=1;
                nst-=2;
            }
            row+=1;
        }
    }
}
