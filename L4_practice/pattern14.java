package L4_practice;

public class pattern14 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        int nst=1;

        while (row<=2*n-1) {
            int cst=1;
            while (cst<=nst) {
                System.out.print("* ");
                cst+=1;
            }
            System.out.println();
            if (row<=n-1) {
                nst+=1;
            } else {
                nst-=1;
            }
            row+=1;
        }
    }
}
