package code_Buddy;
import java.util.Scanner;

public class sum_or_product {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int ch=sc.nextInt();
		int sum=1;
		for(int i=1;i<=n;i++){
			if(ch==1){
				if(i==1) {
					sum=sum-1;
				}
				sum=sum+i;
			}
			else if(ch==2) {
				sum=sum*i;
			}
			else {
				System.out.println("-1");
				return;
			}
	}
		System.out.println(sum);

}
}