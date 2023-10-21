package L2_practice;

import java.util.Scanner;

public class HCF3 {
    public static void main(String[] args) {
        System.out.println("Enter two numbers:  ");
        Scanner scn = new Scanner(System.in);
        int divident=scn.nextInt(); 
        int divisor=scn.nextInt(); 
        
        while (true) {
           int rem=divident%divisor;
           if (rem==0) {
               break;
           }
           divident=divisor;
           divisor=rem;
        }
        System.out.println(divisor);
        scn.close();
    }
}
