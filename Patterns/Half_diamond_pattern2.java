package Patterns;
import java.util.Scanner;
public class Half_diamond_pattern2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		//int n1=(n*2+2)/2;
		//int i=1;
		System.out.println("*");
		if(n==0) {
			System.out.println("*");
		}
		else {
		for(int i=1;i<=n;i++) {
			System.out.print("*");
			int val=1;
			for(int j=0;j<i;j++) {
				System.out.print(val);
				val++;
			}
			val--;
			for(int j=1;j<i;j++) {
				--val;
				System.out.print(val);
			}
			System.out.println("*");
		}
		for(int i=0;i<n;i++) {
			System.out.print("*");
			int val=1;
			for(int j=0;j<(n-i-1);j++) {
				System.out.print(val);
				val++;
			}
			val=val-2;
			for(int j=val;j>=1;j--) {
				System.out.print(j);
			}
			if(i<n-1) {
				System.out.println("*");
			}
			else {
				System.out.println(" ");
			}
			if(n==0) {
				System.out.println("*");
			}
		}
		}
		
		}
	}

