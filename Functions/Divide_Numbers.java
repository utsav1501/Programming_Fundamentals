package Functions;

public class Divide_Numbers {
	public static int divideNumbers(int num,int deno) {
		if(deno==0) {
			return Integer.MIN_VALUE;
		}
		return num/deno;
	}
	public static void main(String[] args) {
		int num=8;
		int deno=0;
		int result=divideNumbers(num,deno);
		System.out.println(result);

	}

}
