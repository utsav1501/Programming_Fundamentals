package Patterns;
import java.util.Scanner;
public class Parellologram_pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=i-1) {
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=n) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i++;
			
		}

	}

}
