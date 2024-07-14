package code_Buddy;
import java.util.Scanner;

public class Terms_of_AP {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int x=sc.nextInt();
		int i=1,n=1;
		while(n<=x && n<=1000) {
			int sum=(3*i)+2;
			i++;
			if(sum%4!=0){
				System.out.print(sum+" ");
				n++;
			}
			
		}

	}

}
