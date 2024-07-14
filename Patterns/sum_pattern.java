package Patterns;
import java.util.Scanner;
public class sum_pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		int count=0;
		while(i<=n) {
			int j=1;
			count=i+count;
			while(j<=i){
				System.out.print(j);
				if(j==i) {
					System.out.print("=");
				}
				else {
					System.out.print("+");
				}
				j++;
			}
			System.out.print(count);
			System.out.println();
			i++;
		}

	}

}
