package L5_practice;

public class n_pattern27 {

    public static void main(String[] args) {
        int n=5;
        int row=1;
        int nst=1;
        int nsp=n-1;
        int val;
        while (row<=n) {
            val=1;
            int csp=1;
            while (csp<=nsp) {
                System.out.print("  ");
                csp+=1;
            }
            int cst=1;
            while (cst<=nst) {
                System.out.print(val+" ");
                if (cst<=nst/2) {
                    val++;
                } else {
                    val--;
                }
                cst+=1;
            }
            System.out.println();
            row+=1;
            nst+=2;
            nsp-=1;
        }
    }
}