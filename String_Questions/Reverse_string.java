package String_Questions;
import java.util.Scanner;
public class Reverse_string {
	public static void reverse(String str) {
		for(int i=str.length()-1;i>=0;i--) {
			System.out.print(str.charAt(i)+" ");
		}
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		reverse(str);

	}

}
