package L6_Function;

public class function_demo {
    static int val=10;
    public static void main(String[] args) {
        System.out.println("hii main");
        System.out.println("---case 1---");
        addition();
        subtraction();

        System.out.println("---case 2---");
        additionparams(100,200);

        System.out.println("---case 3---");
        int x=additionreturn(15, 55);
        System.out.println(x);

        System.out.println("---case 4---");
        System.out.println(val);
        int val=100;
        System.out.println(val);
        System.out.println(function_demo.val);
        System.out.println("---case 5---");
        int one=40;
        int another=20;
        swap(one,another);
        System.out.println("bye main");
    }
    public static void swap(int one, int two){
        int temp=one;
        one=two;
        two=temp;
        System.out.println(one+" "+two);
    }
    public static int additionreturn(int a, int b){
        int sum=a+b;
        return sum;
    }
    public static void additionparams(int a,int b){
        int sum=a+b;
        System.out.println(sum);
    }
    public static void addition() {
        int a=10;
        int b=20;
        int sum=a+b;
        subtraction();
        System.out.println(sum);
    }
    public static void subtraction(){
        int a=100;
        int b=60;
        int diff=a-b;
        System.out.println(diff);
    }
}
