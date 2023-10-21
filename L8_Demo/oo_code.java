package L8_Demo;

public class oo_code {
	public static long evenSumTillN(int n) {
		long sum = 0;
        
        int i = 2;
        
        while(i<=n){
            sum += i;
            i += 2;
        }
        
        return sum;
	}
}