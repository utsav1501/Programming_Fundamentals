package ArrayAssignment;
import java.util.Scanner;

public class _6_sort_0_1 {
public static int[] sort0_1(int arr[]) {
	int start=0;
	int end=arr.length-1;
	while(start<=end) {
		if(arr[start]==0) {
			start++;
		}
		else if(arr[end]==1) {
			end--;
		}
		else {    //arr[start]==1 && arr[end]==0
			int temp=arr[start];
			arr[start]=arr[end];
			arr[end]=temp;
		}
	}
	return arr;
}
public static void print(int arr[]) {
	int n=arr.length;
	for(int i=0;i<n;i++) {
		System.out.print(arr[i]+" ");
	}
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();			
		}
		sc.close();
		sort0_1(arr);
		print(arr);

	}

}
