package ArrayAssignment;
import java.util.Scanner;
public class _5tripletSum {
	public static int triplet(int arr[],int x){
		int count=0;
		for(int i=0;i<arr.length-2;i++) {
			for(int j=i+1;j<arr.length-1;j++) {
				for(int k=j+1;k<arr.length;k++) {
					if(arr[i]+arr[j]+arr[k]==x) {
						count++;
					}
				}
			}
		}
		return count;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		int arr[]=new int[n];
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
		}
		int x=sc.nextInt();
		int ans=triplet(arr,x);
		System.out.println(ans);
	}

}
