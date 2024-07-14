package String_Questions;

import java.util.Scanner;

public class Highest_occuring_character {
	public static char highestOccuringChar(String str) {
		int c1=0,c2=0,i,j;
		 j=0;
		 char maxChar='\0';
		while(j<str.length()) {
			 i=0;
			do {
				 if(str.charAt(i)==str.charAt(j)) {
					 c1++;
				 }
				 i++;
			}
			while(i<str.length());
			if(c1>c2) {
				maxChar=str.charAt(j);
				c2=c1;
			}
			c1=0;
			j++;
		}
		
		return maxChar;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input= s.next();
        System.out.print(highestOccuringChar(input));	
	}

}
