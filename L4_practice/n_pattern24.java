package L4_practice;

public class n_pattern24 {
    public static void main(String[] args) {
        int n=5;
        int val=1;
        int row=1;
        int nst=1;
        int nsp=n-1;
        while (row<=n) {
            int csp=1;
            while (csp<=nsp) {
                System.out.print("  ");
                csp+=1;
            }
            int cst=1;
            while (cst<=nst) {
                System.out.print(val+" ");
                cst+=1;
            }
            System.out.println();
            row+=1;
            nsp-=1;
            nst+=2;

        }
    }
}
