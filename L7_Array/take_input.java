package L7_Array;

import java.util.Scanner;

public class take_input {
    static Scanner src=new Scanner(System.in);
    public static void main(String[] args) {
        //int [] a=array();
        int[]a={10,20,50,70,90};
        display(a);
        System.out.println("the maximum value in array is: "+maximum(a));
        System.out.println("searching item is in index: "+find(a, 70));
        System.out.println(binarysearch(a,70));
    }
    public static int[] array(){
        System.out.print("size of Array: ");
        int n=src.nextInt();
        int[] arr= new int[n];
        for(int i=0;i<arr.length;i++){
            
            System.out.println("arr ["+ i +"] ?");
            arr[i]=src.nextInt();

        }
        return arr;
    }
    public static void display(int[] a){
        System.out.println("the array is: ");
        for(int val:a){
        System.out.print(" "+val);
        }
        System.out.println();
    }
    public static int maximum(int[]a) {
        int max=Integer.MIN_VALUE;
        for(int i=0;i<a.length;i++){
            if(a[i]>max)
            max=a[i];
        }
        return max;
    }
    public static int find(int[]a, int item) {
        System.out.println("item is "+item);
        for(int i=0;i<a.length;i++){
            if (a[i]==item) {
                return i;
            }
        }
        return -1;
    }
    public static int binarysearch(int[]a, int item){
        int low=0;
        int high=a.length-1;
        while (low<=high) {
            int mid=(low+high)/2;
            if (item>a[mid]) {
                low=mid+1;
            }
            else if (item<a[mid]) {
                high=mid-1;
            }
            else{
                return mid;
            }
        }
        return -1;
    }
}
