package String_Questions;
import java.util.Scanner;

public class check_permutation2 {
	public static String arrangeString(String inputString) {
        int i,j;
		String str = "";
		    j = 97;
			while(j <= 122) {
			i = 0;
			do {
				if((int)inputString.charAt(i) == j) {
					str = str + (char)j;
				}
				i++;
			}while(i < inputString.length());
			j++;
		}
			return str;
		
}
	public static boolean isPermutation(String input1, String input2) {
	    // Write your code here
boolean result = true;;
		if(input1.length() != input2.length())
		  result = false;
		else {
			String str1 = arrangeString(input1);
			String str2 = arrangeString(input2);
			for(int i = 0;i < str1.length();i++) {
				if(str1.charAt(i) != str2.charAt(i)) {
					result = false;
					break;
				}
			}
		}
			return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input1 = s.nextLine();
		String input2 = s.nextLine();
		boolean result = isPermutation(input1,input2);
System.out.print(result);
	}

}
