package code_Buddy;
import java.util.Scanner;

public class Total_salary {
public static void main(String[] args) {
	   Scanner sc = new Scanner(System.in);
		int basic = sc.nextInt();
		char c = sc.next().charAt(0);
		long hra = (20* basic) / 100;
		long da = (50* basic) / 100;
		long pf = (11* basic) / 100;
		int allow = 0;
		if (c == 'A') {
			allow = 1700;

		} else if (c == 'B') {
			allow = 1500;
		} else {
			allow = 1300;
		}
		long totalsalary = basic + hra + da + allow - pf;
		System.out.println(totalsalary);
	}


}
