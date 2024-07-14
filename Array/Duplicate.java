package Array;
import java.util.Scanner;
public class Duplicate {
public static int duplicate(int arr[],int n) {
	for(int i=0;i<n;i++) {
		int count=0;
		for(int j=0;j<n;j++) {
		if(arr[i]==arr[j]) {
			count++;
		}
		}
		if(count==2) {
			return arr[i];
		}
	}
	return 0;
}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int ans=duplicate(arr,n);
		System.out.println(ans);
	}

}
