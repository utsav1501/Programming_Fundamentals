package String_Questions;

import java.util.Scanner;

public class Remove_consecutive_Duplicates {

		public static String removeConsecutiveDuplicates(String str) {
			String put="";
			if(str.length()==1){
				return str;
			}
			int i;
			for(i=0;i<str.length()-1;i++){
				if(str.charAt(i)==str.charAt(i+1)) {
					continue;
				}
					else{
						put=put+str.charAt(i);
						
				}
			}
			if(str.charAt(i)==str.charAt(i-1)) {
				put=put+str.charAt(i);
			}
			if(str.charAt(i)!=str.charAt(i-1)) {
				put=put+str.charAt(i);
			}
			return put;
		}
		public static void main(String[] args) {
			Scanner s = new Scanner(System.in);
			String input= s.nextLine();
			String result = removeConsecutiveDuplicates(input);
	System.out.print(result);
		}
}
