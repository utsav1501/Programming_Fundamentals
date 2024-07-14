package Patterns;
import java.util.Scanner;

public class Half_diamond_pattern {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	int i=1;
	while(i<=(2*n+2)/2) {
		int maxvalue=i-1;
		int j=1;{
			while(j<=2*i-1){
				if(j==1) {
					System.out.print("*");
					System.out.print(j);
				}
				int firstnumber=2;
				while(firstnumber<=maxvalue) {
					System.out.print(firstnumber);
					firstnumber++;
				}
				j++;
			}
		}
		System.out.println();
		i++;
	}

	}

}
