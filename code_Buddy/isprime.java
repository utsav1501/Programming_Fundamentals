package code_Buddy;
import java.util.Scanner;

public class isprime {
	public static void main(String[] args) {
	 Scanner s=new Scanner(System.in);
	    int n=s.nextInt();
	    s.close();
	    int i=2;
	    boolean isprime=true;
	    while(i<n){
	    if(n%i==0) {
	    	isprime=false;
	    	System.out.println("composite");
	    	return;
	    	}
	    i++;
	    }
	    if(isprime) {
	    System.out.println("prime");
	    
	    }
	    	
			
		}

}
