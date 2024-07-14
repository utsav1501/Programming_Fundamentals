/***************************************Print_only_Integral_part*****************************************/
package code_Buddy;
import java.util.Scanner;
public class Square_Root {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		int i=2;
		if(n==0){
				System.out.println("0");
				return;
			}
		while(i<n){
			
			if(i*i>n){
				System.out.println(i-1);
				break;
			}
			i++;
		}

	}

}
