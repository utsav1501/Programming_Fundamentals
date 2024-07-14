package String_Questions;

public class Reverse_string_wordwise {
	public static String reverse(String str) {
		int end=str.length()-1, start,j;
		String result="";
		//String word="";
		for(int i=end;i>=0;i--) {
			if(str.charAt(i)==' ') {
				start=i+1;
				String word="";
				for(j=start;j<=end;j++) {
					word=word+str.charAt(j);
				}
				word=word+" ";
				end=i-1;
				result=result+word;
				
			}
			
		}
		//System.out.println(result);
		
		String word="";
		for(j=0;j<=end;j++) {
			word=word+str.charAt(j);
		}
		result+=word;
		
		return result;
	}

	public static void main(String[] args) {
		String str="Hello I am Shreyashish Sengupta";
		String ans=reverse(str);
		System.out.println(ans);

	}

}
