package L2_practice;

import java.util.Scanner;

public class pattern1 {
    public static void main(String[] args) {
        System.out.println("enter a number:  ");
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        int i=1;
        while (i<=n) {
            System.out.println("*");
            i+=1;
        }
        scn.close();
    }
}
