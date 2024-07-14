package Sorting;

public class insertion_Sort {
	public static void insertion(int arr[]) {
		int n=arr.length;
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
	}
	public static void main(String[] args) {
		int arr[]= {5,2,6,1,13,4};
		insertion(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}

	}

}


//for(int i=0;i<n;i++) {
//System.out.println(arr1[i]);
//}