package Array;
import java.util.Scanner;
public class Swap_Alternate {
	public static void print(int arr[]) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static void swapAlternate(int arr[]) {
		for(int i=0;i<arr.length;i+=2) {
			if(i==arr.length-1 && i%2==0) {
				break;
			}
			int temp=arr[i];
			arr[i]=arr[i+1];
			arr[i+1]=temp;
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
				swapAlternate(arr);
				print(arr);
	}

}
