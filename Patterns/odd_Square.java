package Patterns;
import java.util.Scanner;

public class odd_Square {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n) {
			int firstnumber=2*i-1;
			int j=n;
			while(j>0) {
				System.out.print(firstnumber);
				firstnumber=firstnumber+2;
				
				int maxValue=(2*n)-1;
				if(firstnumber>maxValue) {
					firstnumber=1;
				}
				j--;
			}
			System.out.println();
			i++;
		}
		
	}

}
