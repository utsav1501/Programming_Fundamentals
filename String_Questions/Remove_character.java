package String_Questions;
import java.util.Scanner;

public class Remove_character {
	public static String removeAllOccurrencesOfChar(String str, char ch) {
		String word="";
		for(int i=0;i<str.length();i++){
			if(str.charAt(i)==ch){
				continue;
			}
			word=word+str.charAt(i);
		}
		return word;
	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input= s.nextLine();
		char ch=input.charAt(2);
		String result = removeAllOccurrencesOfChar(input,ch);
        System.out.print(result);

	}

}
