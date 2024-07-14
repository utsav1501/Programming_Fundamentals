package String_Questions;
import java.util.Scanner;
public class count_words {
			public static int countWords(String str) {	
			int count=1;
			for(int i=0;i<str.length();i++){
				if(str.charAt(i)==' '){
					count++;
				}
			}
			return count;
		}

		public static void main(String[] args) {	
		Scanner sc=new Scanner(System.in);
		String str=sc.nextLine();
		int ans=countWords(str);
		System.out.println(ans);
	}

}
