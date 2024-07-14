package Sorting;

public class sort_0_1_2 {
	   public static void sort012(int[] arr){
	    	int countzero=0;
	        int countone=0;
	        int counttwo=0;
	        int i=0;
	        int n=arr.length;
	       while(i<n){
	           if(arr[i]==0){
	               countzero++;
	           }
	        else   if(arr[i]==1){
	               countone++;
	           }
	           else{
	               counttwo++;
	           }
	           i++;
	       }
	       for(int h=0;h<countzero;h++){
	           arr[h]=0;
	       }
	       for(int j=countzero;j<countzero+countone;j++){
	           arr[j]=1;
	       }
	       for(int k=countzero+countone;k<n;k++){
	           arr[k]=2;
	       }
	       
	    }

	public static void main(String[] args) {
		int arr[]= {2 ,1, 0, 1, 2, 0};
		sort012(arr);
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}

}
