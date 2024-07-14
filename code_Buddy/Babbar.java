/***************************Taking_characater_as_input******************************/
package code_Buddy;
import java.util.Scanner;

public class Babbar {
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		
		String str=sc.next();
		
		char c=str.charAt(0);
		sc.close();
		
		if(c>='A' && c<='Z') {
			System.out.println("uppercase");
		}
		else if(c>='a' && c<='z') {
			System.out.println("LowerCase");
		}
		else {
			System.out.println("-1");
		}

	}

}
