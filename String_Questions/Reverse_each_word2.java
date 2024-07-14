package String_Questions;

import java.util.Scanner;

public class Reverse_each_word2 {
	public static String reverse(String str) {
		String wapas="";
		String result="";
		int start=0;
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==' '){
				int end=i-1;
				wapas="";
				for(int j=end;j>=start;j--){
						wapas=wapas+str.charAt(j);
				}
				wapas=wapas+" ";
				start=i+1;
				result=result+wapas;
			}
		}
		//System.out.println(result);
		wapas="";
		for(int i=str.length()-1;i>=start;i--) {
			wapas=wapas+str.charAt(i);
		}
		result=result+wapas;
		return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input= s.nextLine();
		String result = reverse(input);
        System.out.print(result);

	}

}
