package L7_Array;

public class Array_demo {
    public static void main(String[] args) {

        //creat
        int[] arr =null;
        System.out.println(arr);
        arr= new int[5];
        System.out.println(arr);

        //how many no. of elements  in array
        System.out.println(arr.length);

        //get
         System.out.println(arr[0]);
         System.out.println(arr[1]);
         System.out.println(arr[2]);
         System.out.println(arr[3]);
         System.out.println(arr[4]);
        
        
        //  Set/update
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;        

        //get
         System.out.println(arr[0]);
         System.out.println(arr[1]);
         System.out.println(arr[2]);
         System.out.println(arr[3]);
         System.out.println(arr[4]);
       

        // for loop
        for(int i=0; i<arr.length; i+=1){
            System.out.println(arr[i]);
        }

        //enhanced for loop
        System.out.println("---EFL---");
        for(int val:arr)//arr-> traverse in which array 
        {
            System.out.println(val);
        }
    }
}
