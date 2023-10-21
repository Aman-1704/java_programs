package L2_practice;

import java.util.Scanner;

public class HCF2{
    public static void main(String[] args) {
        System.out.println("Enter two numbers:  ");
        Scanner scn= new Scanner(System.in);

        int a=scn.nextInt();
        int b=scn.nextInt();

        int hcf=1;
        int min=Math.min(a,b);
        int count=1;
        
        while (count<=min) {
            if (a%count==0 && b%count==0) {
                hcf=count;
            }
            count+=1;
        }
        System.out.println(hcf);
        scn.close();
    }
}
