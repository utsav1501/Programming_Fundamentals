/************************Prime_number************************/
package Breakandcontinue;
import java.util.*;
public class BreakDemo {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int d;
		boolean divided=false;
		for(d=2;d<n;d++) {
			if(n%d==0) {
				divided=true;
				break;          //Here we use break because why we check next number if it is already divided by other number
			}
			}
		if(divided) {
			System.out.println("Not Prime");
		}
		else {
			System.out.println("prime");
		}
	}

}
