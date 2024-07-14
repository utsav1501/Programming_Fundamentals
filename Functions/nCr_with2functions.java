package Functions;
import java.util.Scanner;
public class nCr_with2functions {
	public static int factorial(int n) {
		int ans=1;
		for(int i=1;i<=n;i++) {
			ans=ans*i;
		}
		return ans;
	}
	public static int nCr(int n,int r) {
		int num=factorial(n);
		int den1=factorial(r);
		int den2=factorial(n-r);
		int ans=num/(den1*den2);
		return ans;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		int ans=nCr(n,r);
		System.out.println(ans);
	}
}
