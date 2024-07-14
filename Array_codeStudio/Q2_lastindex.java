package Array_codeStudio;
import java.util.* ;
//import java.io.*; 
public class Q2_lastindex {
	
	class Solution {
		public static int lastindex(int arr[],int x){
			for(int i=arr.length-1;i>=0;i++) {
				if(arr[i]==x) {
					return i;
				}
			}
			return -1;
		}
		public static void main(String args[]) {
			Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
			int arr[]=new int[n];
			for(int i=0;i<n;i++){
				arr[i]=sc.nextInt();
			}
			int x=sc.nextInt();
			int ans=lastindex(arr,x);
			System.out.println(ans);
		}
	}
}
