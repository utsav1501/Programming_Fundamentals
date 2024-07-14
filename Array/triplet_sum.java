package Array;

import java.util.Scanner;

public class triplet_sum {

	 public static int pairsum(int arr[], int x) {
   	int count=0;
       for(int i=0;i<arr.length-1;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]+arr[j]==x){
                   count++;
               }
           }
       }
       return count;
   }

	public static int tripletSum(int[] arr, int x) {
  int n=arr.length;
		for(int i=1;i<n;i++) {
			int temp=arr[i];
			int j=i-1;
			for(;j>=0;j--) {
			if(arr[j]>temp){
				arr[j+1]=arr[j];//yha pe hum j ko bs aage shift kr rhe h
			}
			else{   //means arr[j]<arr[i] hai  so yha hum kuch nhi krenge
				break;
		}
	}
			arr[j+1]=temp;
	}
		for(int i=0;i<arr.length;i++) {
		System.out.print(arr[i]+" ");
		}
	int carry=pairsum(arr,x);
	return carry;
  		 }

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int ans=tripletSum(arr,x);
		System.out.println(ans);
	}

}
