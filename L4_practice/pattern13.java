package L4_practice;

public class pattern13 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        while (row<=n) {
            int col=1;
            while (col<=n) {
                if (row==col||row+col==n+1) {
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
                col+=1;
            }
            System.out.println();
            row+=1;
        }
    }
}
