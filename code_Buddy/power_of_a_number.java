package code_Buddy;
import java.lang.Math;
import java.util.Scanner;

public class power_of_a_number {
	
	public class Solution {
	    
	    public static void main(String[] args) {
	    	Scanner s=new Scanner(System.in);
//	        int x=s.nextInt();
//	        int n=s.nextInt();
//	        if(n==0){
//	            System.out.println("1");
//	        }
//	        else if(x==0){
//	            System.out.println("0");
//	        }
//	        else if(x==0 && n==0){
//	            System.out.println("1");
//	        }
//	        else{
//	        System.out.println(Math.pow(x,n));
	       // }
	    	 
	         int x=s.nextInt();
	         int n=s.nextInt();
	         int i=1;
	         int sum=0;
	         while(i<=n){
	           int power=i*n;
	           sum=sum+power;
	           i++;
	         }
	         System.out.println(sum);
	    }
	}

}
