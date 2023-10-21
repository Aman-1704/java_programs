package L4_practice;

public class n_pattern25 {
    public static void main(String[] args) {
        int n=5;
        int val=1;
        int row=1;
        int nst=1;
        int nsp=n-1;
        while (row<=n) {
            int csp=1;
            while (csp<=nsp) {
                System.out.print("\t ");
                csp+=1;
            }
            int cst=1;
            while (cst<=nst) {
                System.out.print(val+"\t ");
                val+=1;
                cst+=1;
            }
            System.out.println();

            row+=1;
            nsp-=1;
            nst+=2;

        }
    }
}
