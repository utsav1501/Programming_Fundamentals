package code_Buddy;
import java.util.Scanner;
public class Diamond_of_stars {
	
	    
	    public static void main(String[] args) {
	 		Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int i=1;
			int n1=(n+1)/2;
			
			while(i<=n1) {
				int j=1;
				while(j<=n1-i) {
					System.out.print(" ");
					j++;
				}
				j=1;
				while(j<=2*i-1) {
					System.out.print("*");
					j++;
				}
				
				System.out.println();
				i++;

			}
			int n2=n/2;
			i =n1-1;
			 while(i<=n2) {
			int j=1;
			while(j<=n2-i+1) {
				if(i==0) {
					return;
				}
				System.out.print(" ");
				j++;
			}
			j=1;
			while(j<=2*i-1) {
				System.out.print("*");
				j++;
			}
			System.out.println();
			i--;
		
	}
	        
	    }
	}