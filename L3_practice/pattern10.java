package L3_practice;

public class pattern10 {
    public static void main(String[] args) {
        int n=5;
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
                if (cst%2==0) {
                    System.out.print("! ");
                } else {
                    System.out.print("* ");
                }
                cst+=1;
            }
            System.out.println();
            row+=1;
            nsp-=1;
            nst+=2;

        }
    }
}
