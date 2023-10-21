package L8_Demo;

import java.util.Scanner;
public class demo{
    public static int sumOfOdd(int n){
        int sum=0;
        for(int i=1;i<=n;i++){
            if(i%2!=0){
                System.out.println(i);
                sum=sum+i;  
            }
        }
        return sum;
    }
    public static void main(String[] args){
        System.out.println("enter a numbers from 1>=n<=1000: ");
        Scanner src=new Scanner(System.in);
        int n=src.nextInt();
        
        int sum=sumOfOdd(n);
        System.out.println("The sum of all odd numbers from 1 to "+n+" is: "+sum);
        src.close();
    }
}