package L5_practice;

import java.util.Scanner;
public class inverse {
    public static void main(String[] args) {
        System.out.println("entar number:  ");
        Scanner scn= new Scanner(System.in);

        int n=scn.nextInt();
        int pos=1;
        int ans=0;
        while (n!=0) {
            int rem=n%10;
            ans = ans+pos*(int)Math.pow(10,rem-1);
            
            pos+=1;
            n=n/10;
        }
        System.out.println("the inverse of given number is: "+ans);
        scn.close();
    }
}
