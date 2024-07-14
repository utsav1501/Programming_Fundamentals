package code_Buddy;
import java.util.Scanner;

public class farenheit_to_celcius {
	
public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
		
			int f1=sc.nextInt();

			int f2=sc.nextInt();
			 int w=sc.nextInt();
			 while(f1<=f2){
				 int c=(5)*(f1-32)/9;
				 System.out.println(f1+" "+c);
				 f1=f1+w;
			 }
			
			 
		}

	}


