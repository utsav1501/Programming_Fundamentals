package Sorting;
import java.lang.Math;
public class pair_with_smallest_difference {
	 public static void smallestDifferencePair(int []arr1, int n, int []arr2, int m) {
		 //1st array ko short krenge
		 for(int i=1;i<n;i++) {
				int temp=arr1[i];
				int j=i-1;
				for(;j>=0;j--) {
				if(arr1[j]>temp){
					arr1[j+1]=arr1[j];
				}
				else{   
					break;
			}
		}
				arr1[j+1]=temp;
		 }
		 //2nd array ko short krenge
		 for(int i=1;i<m;i++) {
				int temp=arr2[i];
				int j=i-1;
				for(;j>=0;j--) {
				if(arr2[j]>temp){
					arr2[j+1]=arr2[j];
				}
				else{ 
					break;
			}
		}
				arr2[j+1]=temp;
		 }
	     // dono array short ho chuka hai
		 //ab aage proceed krte hai
		 int mini=Integer.MAX_VALUE;
		 int i=0;
		 int j=0;
		 while(i<n && j<m) {
			int c= Math.abs(arr1[i]-arr2[j]);
			mini=Math.min(mini,c);
			if(arr1[i]<arr2[j]) {
				i++;
			}
			else {
				j++;
			}
			
		 }
		 System.out.print(mini+" ");
		 

	 }

	public static void main(String[] args) {
		int arr1[]= {10,20,30};
		int arr2[]= {17,15};
		smallestDifferencePair(arr1,arr1.length,arr2,arr2.length);

	}

}
