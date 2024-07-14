package code_Buddy;
import java.util.Scanner;
public class DecimalTobinary {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int rem=0;
		long rev=0;
		int place=0;
		while(n!=0){
			rem=n%2;
			//rev=rem;
			// if(rem==0) {
			// 	System.out.print(rem);
			// }
			
			rem=rem*10+place;
			place=place*10;
			n=n/2;
			
		}
		System.out.print(rem);
		}
		
		}
