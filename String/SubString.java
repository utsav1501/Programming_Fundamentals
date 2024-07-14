package String;

public class SubString {

	public static void main(String[] args) {
		String str1="coding";
		System.out.println(str1.substring(4));
		System.out.println(str1.substring(6));
		String substr=str1.substring(1,4);
		System.out.println(substr);
		System.out.println(substr.length());
		System.out.println(str1.substring(1, 4));
		String str2="Thegreatgambler";
		System.out.println(str2.substring(2,8));
	}

}
