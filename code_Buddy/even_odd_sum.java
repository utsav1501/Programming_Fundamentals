package code_Buddy;
import java.util.Scanner;


public class even_odd_sum {
	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
   int n=sc.nextInt();
   sc.close();
   int even=0;
   int odd=0;
   while(n>0) {
	   int sum=n%10;
	   if(sum%2==0) {
		   even=even+sum;
		   }
	   else {
		   odd=odd+sum;
	   }
	   n=n/10;
	  
   } 
   System.out.println(even+" "+odd);
   }

}

