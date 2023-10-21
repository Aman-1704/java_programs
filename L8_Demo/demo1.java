package L8_Demo;

import java.util.Scanner;

public class demo1 {
    public static void greater(int a, int b){
        if (a>b) {
            System.out.println(a+" is greater then "+b );
        } else if (b>a){
            System.out.println(b+" is greater then "+a);
        }else{
            System.out.println("both numbers are equale");
        }
    }
    public static void main(String[] args){
        System.out.println("Enter two numbers: ");
        Scanner src= new Scanner(System.in);
        int a= src.nextInt();
        int b= src.nextInt();
        greater(a, b);
        src.close();
    }
}
