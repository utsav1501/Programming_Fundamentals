package Test1;
import java.util.Scanner;
public class Number_star_pattern_1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int i=1;
		while(i<=n){
			int j=n;
			while(j>=1){
				if(j==i){
					System.out.print("*");
				}
				else{
				System.out.print(n-j+1);
				}
				j--;
			}
			System.out.println();
			i++;
		}
	}

}
