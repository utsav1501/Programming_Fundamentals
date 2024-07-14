package Array;
import java.util.Scanner;
public class maximum_value {
	public static int largestInArray(int arr[],int n) {
		int max=Integer.MIN_VALUE;//this sets max at minus infinity
		for(int i=0;i<n;i++) {
			if(arr[i]>max) {
				max=arr[i];
			}
		}
		return max;
	}
	public static void print(int arr[],int size) {
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		print(arr,n);
		int maxValue=largestInArray(arr,n);
		System.out.println(maxValue);
	}

}
