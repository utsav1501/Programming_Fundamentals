package Breakandcontinue;
import java.util.*;
public class pattern {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int i;
		for(i=1;i<=n;i++) {
			int j;
			for(j=1;j<=n;j++) {
				if(j>i) {
					break;
				}
				System.out.print(j);
				
			}
			
			System.out.println();
		}
	}

}
