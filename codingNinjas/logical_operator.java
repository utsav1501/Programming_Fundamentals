package codingNinjas;
import java.util.Scanner;

public class logical_operator {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int a=s.nextInt();
		int b=s.nextInt();
		int c=s.nextInt();
		
		boolean islargest=(a>=b && a>=c);// AND operator it check both condition and both needs to be  true then output is true
		System.out.println(islargest);
		
		boolean islargest1=(a<=b || a>=c); // OR operator it check both condition if 1 is true then output is true
		System.out.println(islargest1);
		
		
		System.out.println(!(a>=b));//return oppsite value
		System.out.println(!(a<=b));
		
		

	}

}
