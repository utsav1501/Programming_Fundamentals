package String_Questions;
import java.util.Scanner;
public class palindrome {
	public static void palindrome(String str) {
		int end=str.length()-1;
		int start=0;
		while(start<=end) {
			if(str.charAt(start)==str.charAt(end)) {
				start++;
				end--;
			}
			else {
				System.out.println("Not palindrome!");
				return;
			}
		}
		System.out.println("palindrome!");
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int n=sc.nextInt();
		String str=sc.next();
		palindrome(str);
	}

}
