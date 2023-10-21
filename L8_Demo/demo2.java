package L8_Demo;

import java.util.Scanner;
public class demo2{
    public static void main(String[] args){
        int p=0,n=0,z=0;
        Scanner src= new Scanner(System.in);
        System.out.println("enter numbers from -100 to 100 : ");
        for(int i=1;i<10;i++){
            int num=src.nextInt();
            if (num>0){
                p++;
            }else if (num<0) {
                n++;
            }else{
                z++;
            }
        }
        System.out.println("positive: "+p);
        System.out.println("negative: "+n);
        System.out.println("zero    : "+z);
        src.close();
    }
}
