package if_else;
import java.util.Scanner;

public class Even_odd {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=n%2;
		sc.close();
		if(rem==0) {
			System.out.println("Even");
			return;
		}
		System.out.println("odd");
		
		
//		else {
//			System.out.println("odd");
//		}
		
	}
}
