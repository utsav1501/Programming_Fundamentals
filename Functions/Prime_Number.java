package Functions;
import java.util.Scanner;
public class Prime_Number {
	public static boolean isprime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
		    return false;
		}
	}
		return true;
}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		boolean ans=isprime(n);
		System.out.println(ans);
	}

}
