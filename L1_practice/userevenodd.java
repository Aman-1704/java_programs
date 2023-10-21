package L1_practice;

import java.util.Scanner;

public class userevenodd{
    public static void main(String[] args) {

        System.out.println("Hello Welcome In This Programm");

        System.out.println("Plese enter a number: ");

        Scanner var = new Scanner (System.in) ;

        int num = var.nextInt();

        System.out.println("the number you have given is : "+num);

        if(num%2==0){
            System.out.println("And this is even");
        }
        else{
            System.out.println("And this  is odd");
        }
        var.close();
    }
}
