package L6_Function;

public class Armstrong {
    public static void main(String[] args) {
        printArmstrong(10, 1000);
    }
    public static void printArmstrong(int low, int high){
        for(int n=low; n<=high; n+=1){
            boolean res=isArmstrong(n);
            if (res==true) {
                System.out.println(n);
            }
        }
    }
    public static boolean isArmstrong(int n){
        int nod=Nod(n);
        int on=n;
        int ans=0;
        while (n!=0) {
            int rem=n%10;
            ans=ans+(int)(Math.pow(rem,nod));
            n=n/10;
        }
        if (ans==on) {
            return true;
        } else {
            return false;
        }
    }
    public static int Nod(int n){
        int nod=0;
        while(n!=0) {
            nod+=1;
            n=n/10;
        }
        return nod;
    }
}
