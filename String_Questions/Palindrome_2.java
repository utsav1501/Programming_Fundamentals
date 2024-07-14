package String_Questions;
import java.util.Scanner;
public class Palindrome_2 {
	public static boolean isPalindrome(String str) {
		int start=0;
		int end=str.length()-1;
		while(start<=end){
			if(str.charAt(start)==str.charAt(end)){
				start++;
				end--;
			}
			else{
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str=sc.next();
		boolean ans=isPalindrome(str);
		System.out.println(ans);

	}

}
