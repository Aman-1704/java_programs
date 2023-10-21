package L4_practice;

public class pattern12 {
    public static void main(String[] args) {
        int n=5;
        int row=1;
        while (row<=n) {
            int col=1;
            while (col<=n) {
                if (row==1||col==1||row==n||col==n) {
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
