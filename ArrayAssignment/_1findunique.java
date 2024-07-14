package ArrayAssignment;
import java.util.Scanner;
public class _1findunique 
	{
		public static int unique(int arr[]) {
				int i,j,c;
		        for(i=0;i<arr.length;i++){
		            c=0;
		            for(j=0;j<arr.length;j++){
		                if(arr[i]==arr[j]) 
		                    c++;
		            }
		            if(c==1)
		            {
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
			//int arr[]= {3, 1, 4, 3, 4 };
			//System.out.println(arr.length);
			int ans=unique(arr);
			System.out.println(ans);
			
			
		}

	}
