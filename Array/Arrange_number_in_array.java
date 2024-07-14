package Array;

import java.util.Scanner;

public class Arrange_number_in_array {
	
	public static void print(int arr[] ){
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	 public static int[] arrange_number(int[] arr, int n) {
	    	int start=0;
	        int end=n-1;
	        int i=1;
	        while(start<=end){
	            if(i%2==1){
	                arr[start]=i;
	               // System.out.print(arr[start]);
	                start++;
	                i++;
	                

	            }
	            else{
	                arr[end]=i;
	                //System.out.print(arr[end]);
	                end--;
	                i++;
	               
	            }
	        }
	       return arr; 
	    }
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
				arrange_number(arr,n);
				print(arr);
	}

}
