package String_Buffer;

public class Example {
	public static void main(String[] args) {
		StringBuffer str=new StringBuffer("abc");
		str.setCharAt(0, 'd');
		System.out.println(str);
		for(int i=0;i<3;i++) {
			str.setCharAt(i, 'c');
		}
		System.out.println(str);
	}

}
