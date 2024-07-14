package String_Questions;
import java.util.Scanner;

public class check_permutation {
	public static String arrangeString(String inputString) {
			int i,j;
			String str="";
			j=97;
			while(j<=122){
				i=0;
				do {
					if((int)inputString.charAt(i) == j) {
						str = str + (char)j;
					}
					i++;
				}
				while(i < inputString.length());
				j++;
		}
			return str;
			}
		
	public static boolean isPermutation(String str1, String str2) {
		boolean result=true;
		if(str1.length()!=str2.length()){
			return false;
		}
		else{
			String input1=arrangeString(str1);
			String input2=arrangeString(str2);
			for(int i=0;i<input1.length();i++){
				if(input1.charAt(i) != input2.charAt(i)){
					result=false;
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
