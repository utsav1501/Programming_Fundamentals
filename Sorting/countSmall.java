package Sorting;

public class countSmall {
	  public static int binary_Search(int arr2[],int element){
		  int start=0;
		  int end=arr2.length-1;
          while(start<=end){
              int mid=(start+end)/2;
              if(arr2[mid]<=element){
                  start=mid+1;
              }
              else{
                  end=mid-1;
              }
          }
          return end;
}

    public static void countS(int n, int m, int []a, int []b) {
       //n=number of elements in array A
       //m=number of elements in array B
    	for(int i=1;i<m;i++) {
			int temp=b[i];
			int j=i-1;
			for(;j>=0;j--) {
			if(b[j]>temp){
				b[j+1]=b[j];
			}
			else{   
				break;
		}
	}
			b[j+1]=temp;
	}
    	  for(int i=0;i<n;i++){
              int ans=binary_Search(b,a[i]);
              //int arr=new int[n]
              System.out.print((ans+1)+" ");
   }
    }

    	public static void main(String[] args){
        int a[] = {0 ,2 ,3 };
        int b[] = { 1 ,5 };
//		int n=a.length;
//		int m=b.length;
        countS(a.length,b.length,a,b);
		           

	}

}

