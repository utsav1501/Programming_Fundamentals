package code_Buddy;
import java.util.Scanner;
public class evensum {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int i=1;
		int sum=0;
		while(i<=n) {
			if(i%2==0) {
				sum+=i;
			}
			i++;
		}
		System.out.println(sum);
	}

}
