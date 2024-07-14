package code_studio_problems;

public class total_prime {
	public static int allprime(int start,int end) {
		int i,j;
		int count=0;
		for(i=start;i<=end;i++) {
			for(j=2;j<i;j++) {
				if(i%j==0) {
					break;
				}
				
			}
			if(i==j) {
				count++;
			}
			
		}
		return count;
	}
	public static void main(String[] args) {
		int start=2;
		int end=9;
		int ans=allprime(start,end);
		System.out.println(ans);
	}

}
