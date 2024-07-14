package codingNinjas;
import java.util.Scanner;

public class fahTocel {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int f=sc.nextInt();
		/*int cel=(5/9)*(f-32);
		/System.out.println(cel);//here output is 0 ,due to associativity
		*/
//		int cel=(5*(f-32))/9;  //another method to print celcius
//		System.out.println(cel); 
		
		
		//but here we do typecasting
		
		int cel=(int)((5.0/9)*(f-32));
		System.out.println(cel);
		
		System.out.println(5.0/9);
		

	}

}
