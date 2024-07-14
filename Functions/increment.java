package Functions;

public class increment {
	public static int increment(int n) {
		n=n+1;
		return n;
	}

	public static void main(String[] args) {
		int a=10;
		int ans=increment(a);
		System.out.println(ans);
		System.out.println(a);
	}

}
