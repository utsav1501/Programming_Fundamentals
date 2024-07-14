package Array;
import java.util.Scanner;
public class Arrange_numbers_in_aray {
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static int [] arrange(int arr[],int n) {
		int start=0,end=n-1;
		int i=1;
		while(start<=end) {
			arr[start]=i;
			//System.out.print(arr[start]);
			i++;
			
			arr[end]=i;
			//System.out.print(arr[end]);
			i++;
			start++;
			end--;
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
		arrange(arr,n);
		print(arr);

	}

}
