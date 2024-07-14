package Patterns;
import java.util.Scanner;
public class Inverted_number_pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n+1-i) {
				System.out.print(n-i+1);
				j++;
			}
			System.out.println();
			i++;
		}

	}

}
