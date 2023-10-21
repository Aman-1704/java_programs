package L2_practice;

import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        System.out.println("Enter A Number: ");
        Scanner scn = new Scanner(System.in);
        int n=scn.nextInt();
        while (n!=0) {
            int rem= n%10;
            System.out.print(rem);
            n=n/10;
        }
        scn.close();
    }
}
