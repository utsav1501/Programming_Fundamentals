package code_Buddy;
import java.util.Scanner;
public class Reverse_of_a_number {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int sum=0;
		int rev=0;
		
		while(n!=0) {
			
			sum=n%10;
			rev=rev*10+sum;
			n=n/10;
		}
		System.out.println(rev);
		
	}
	

}
//https://www.codingninjas.com/codestudio/guided-paths/pointers
