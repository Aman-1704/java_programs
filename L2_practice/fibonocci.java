package L2_practice;

import java.util.Scanner;

public class fibonocci {
    public static void main(String[] args) {

        System.out.println("Enter a number to know how many terms of fibonocci series are print");

        Scanner scn = new Scanner(System.in);
        int n =scn.nextInt();
        int count=1;

        int a =0;
        int b =1;
        while (count<=n+1) {
        System.out.println(a);
        int Sum = a+b;
        a=b;
        b=Sum;
        count+=1;
        
            }
            scn.close();
    }
    
}
