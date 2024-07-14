package String;
import java.util.Scanner;

public class Print_all_characters {
	public static void printCharacters(String str) {
		for(int i=0;i<str.length();i++) {
			System.out.print(str.charAt(i)+" ");
		}
	}

	public static void main(String[] args) {
	  Scanner sc=new Scanner(System.in);
	  String str=sc.nextLine();
	  printCharacters(str);
//	  int n=str.length();
//	  System.out.println(str.substring(0, n));

	}

}
