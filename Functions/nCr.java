package Functions;
import java.util.Scanner;

public class nCr {
		public static int factorial(int n) {
			int ans=1;
			int i=1;
			while(i<=n) {
				ans=ans*i;
				i++;
			
			}
			return ans;
		}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int r=sc.nextInt();
		sc.close();
		
	    int num=factorial(n);
	    int den1=factorial(r);
	    int den2=factorial(n-r);
	    
	    int ans=num/(den1*den2);
	    System.out.println(ans);
	}

}
