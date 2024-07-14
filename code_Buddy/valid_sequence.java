package code_Buddy;
import java.util.Scanner;
public class valid_sequence {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int prev=sc.nextInt();
		int a=0;
		int b=0;
		boolean isdec=true;
		if(n==0){
			System.out.println("false");
		}
		if(n<=0 && n==1){
			a=1;
		}
		int i=1;
		while(i<n){
			int curr=sc.nextInt();
			if(prev==curr){
				a=1;
			}
			else if(prev>curr){
				if(isdec){
					prev=curr;
				}
				else if(b==1){
					a=1;
				}
				else{
					a=1;
				}
			}
				else if(prev<curr){
					isdec=false;
					prev=curr;
					b=1;
				}
				i++;
				}
				if(a==0){
					System.out.print("true");
				}
				else{
					System.out.print(false);
				}

	}

}
