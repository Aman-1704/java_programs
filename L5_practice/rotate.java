package L5_practice;

import java.util.Scanner;
public class rotate {
    public static void main(String[] args) {
        System.out.println("Enter Number:  ");
        Scanner scn =new Scanner(System.in);

        int n=scn.nextInt();
        System.out.println("rotation no. :  ");
        Scanner sc = new Scanner(System.in);
        int rot =sc.nextInt();
        System.err.println("The given number is : "+n);
        System.err.println("number of rotation is : "+rot);

        //number of Digits
        int temp=n;
        int nod=0;
        while(temp!=0) {
            nod+=1;
            temp=temp/10;
        }
        rot=rot%nod;
        //rotation
        int divisor=(int)Math.pow(10, rot);//10^rot
        int rem=n%divisor;
        int quot=n/divisor;
        int mult=(int)Math.pow(10, nod-rot);
        int ans= rem*mult +quot;
        System.out.println("the answer is:  "+ans);
     scn.close();
     sc.close();   
    }
}
