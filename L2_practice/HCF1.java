package L2_practice;

import java.util.Scanner;

public class HCF1 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:  ");
        Scanner scn= new Scanner(System.in);

        int a=scn.nextInt();
        int b=scn.nextInt();

        int min=Math.min(a,b);
        int count=min;
        
        while (count>=1) {
            if (a%count==0 && b%count==0) {
                System.out.println(count);
                break;
            }
            count-=1;
        }
        scn.close();
    }
}
