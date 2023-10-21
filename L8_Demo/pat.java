package L8_Demo;
import java.util.Scanner;
public class pat {
    

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int i = 1;
		char p;
		while (i <= N) {
			int j = 1;
			p = (char) ('A' + N - 1);
			while (j <= i) {
				System.out.print(p);
				p = (char) (p + 1);
				j++;
				
			}
			N--;
			System.out.println();

			i++;
		}
        sc.close();
	}
}

