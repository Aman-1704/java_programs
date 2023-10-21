package L4_practice;

public class pattern20 {
    public static void main(String[] args) {
        int n=7;
        int row=1;
        int nst=n/2;
        int nsp=1;

        while (row<=n) {
            int cst=1;
            while (cst<=nst) {
                System.out.print("* ");
                cst+=1;
            }
            int csp=1;
            while (csp<=nsp) {
                System.out.print("  ");
                csp+=1;
            }
            cst=1;
            while (cst<=nst) {
                System.out.print("* ");
                cst+=1;
            }
            System.out.println();
            if (row<=n/2) {
                nsp+=2;
                nst-=1;
            } else {
                nsp-=2;
                nst+=1;
            }
            row+=1;
        }
    }
}
