package Sorting;

public class merge_two_sorted_array {
	public static int[] merge(int arr1[], int arr2[]) {
    	int arr3[]=new int [arr1.length+arr2.length];
        int i=0;
        int j=0;
        int k=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]>arr2[j]){
                arr3[k]=arr2[j];
                k++;
                j++;
            }
            else{
                arr3[k]=arr1[i];
                k++;
                i++;
            }
        }
        while(i<arr1.length){
            arr3[k]=arr1[i];
            k++;
            i++;
        }
        while(j<arr2.length){
            arr3[k]=arr2[j];
            k++;
            j++;
        }
        return arr3;
    }


	public static void main(String[] args) {
		int arr1[]= {1,3,5,7,9};
		int arr2[]= {2,4,6,8,10};
		int ans[]=merge(arr1,arr2);
		for(int i=0;i<ans.length;i++) {
			System.out.print(ans[i]+" ");
		}
		System.out.println();
	}

}
