package Array_codeStudio;
import java.util.Scanner;

public class kth_largest_and_kth_Smallest {
	
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();//array length
	int k=sc.nextInt();
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
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
			//array sort ho chuka hai ab:
	
	System.out.print(arr[k-1]+" "+arr[n-k]);
	
	
}
}

