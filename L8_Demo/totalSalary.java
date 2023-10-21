package L8_Demo;
import java.util.Scanner;
public class totalSalary {
	
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		int basic = sc.nextInt();
		char grade = sc.next().charAt(0);
		int hra= basic*20/100;
		int da = basic*50/100;
		int pf = basic*11/100;
		int allow;
		if(grade=='A'){
			allow=1700;
		}else if(grade=='B'){
			allow=1500;
		}else{
			allow=1300;
		}
		long totalSalary = basic+hra+da+allow-pf;
		System.out.println(totalSalary);
		sc.close();
	}
}