package if_else;
import java.util.Scanner;

public class largest_of_three {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int b=sc.nextInt();
		int c=sc.nextInt();
		sc.close();
		
//		if(a>=b && a>=c) {
//			System.out.println(a);
//		}else {
//			
//			if(b>=a && b>=c) {
//				System.out.println("b:"+b);
//			}
//			else {
//				System.out.println(c);
//			}
//		}
		
		
		if(a>=b && a>=c) {
			System.out.println(a);
		}
		else if(b>=a && b>=c) {
			System.out.println(b);
		}
		else {
			System.out.println(c);
		}
	}

}
