package code_Buddy;
import java.util.Scanner;

public class Quesations {
	public static void main(String[] args) {
		
		Scanner clay=new Scanner(System.in);
		char n=clay.next().charAt(0);
		clay.close();
		
		int a=n;
		if(a>=65 && a<=90) {
			System.out.println("1");
		}
		else if(a>=97 && a<=122) {
			System.out.println("0");
		}
		else {
			System.out.println("-1");
		}
		
	}

}
