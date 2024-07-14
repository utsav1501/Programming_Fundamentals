                           /**Note**/

/****************This_question_is_directly_asked_in_inteviews*******************/
package String_Questions;

import java.util.Scanner;

public class String_compression {
	public static String compress(String str) {
		String ans="";
		int i=0;
		while(i<str.length()){
			int j=i+1;
			while(j<str.length() && str.charAt(i)==str.charAt(j)) {
				j++;
			}

			ans=ans+str.charAt(i);
			int count=j-i;
			if(count>1){
				ans=ans+count;
			}
			i=j;
		}
		return ans;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input= s.next();
        System.out.print(compress(input));

	}

}
