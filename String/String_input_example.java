package String;
import java.util.Scanner;
public class String_input_example {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String str;
		int i=sc.nextInt();
		str=sc.next();
		System.out.println(str+" "+str.length());
		
		
		//If we take input integer value and put enter then it will print 0 because sc.nextLine() encounters enter and stops and print NULL
		/*for example:-if we take input i.e, 13 and type enter(from keyboard) then 0 will be output*/
		
	}
}
