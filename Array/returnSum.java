package Array;
import java.util.Scanner;
public class returnSum {
	public static int sum(int[] arr) {
	//Scanner sc=new Scanner(System.in);
	// int n=sc.nextInt();
//	for(int i=0;i<arr.length;i++){
//		arr[i]=sc.nextInt();
//	}	
	int sum=0;
	for(int i=0;i<arr.length;i++){
		sum=sum+arr[i];
	}
		return sum;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ans=sum(arr);
		System.out.println(ans);
	}
}
