package String;
import java.util.Scanner;

public class String_input {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//String str=""
		String str;
		str=sc.next();
		System.out.println(str+" "+str.length());
		String str2=sc.nextLine();
		System.out.println(str2+" "+str2.length());//it will take space as well before staring of character if exist(space)

	}

}
