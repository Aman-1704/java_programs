package L1_practice;

import java.util.Scanner;

public class prime2 {
    public static void main(String[] args) {
        int i=2;
        int count=0;
        System.out.println("Enter a number   : ");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        while (i<=n-1) {
            if (n%i==0) {
                count=count+1;
                break;
            }
            i=i+1;
        }
        if (count==0) {
            System.out.println(n+" is prime");
        } else {
            System.out.println(n+" is not prime");
        }
        in.close();
    }
}
