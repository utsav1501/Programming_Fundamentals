package String_Questions;

public class All_substrings {
	public static void substring(String str) {
		for(int i=0;i<str.length();i++) {
			for(int j=i;j<str.length();j++) {
				System.out.print(str.substring(i, j+1)+" ");
			}
		}
	}

	public static void main(String[] args) {
		String str="ABCD";
		substring(str);

	}

}
