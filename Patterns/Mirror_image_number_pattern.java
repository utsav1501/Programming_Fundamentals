package Patterns;
import java.util.Scanner;

public class Mirror_image_number_pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int j=1;
			while(j<=n-i) {
				System.out.print(" ");
				j++;
			}
			 j=1;
			 int count=1;
			
			while(j<=i) { 
				System.out.print(count);
				count++;
				j++;
			}
			i++;
			System.out.println();
		}
		
		
	}

}
