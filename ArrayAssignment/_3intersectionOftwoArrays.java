package ArrayAssignment;
import java.util.Scanner;

public class _3intersectionOftwoArrays {
	


		public static void intersection(int arr1[],int arr2[]) {
			int n=arr1.length;
			int m=arr2.length;
			for(int i=0;i<n;i++) {
				for(int j=0;j<m;j++) {
					if(arr1[i]==arr2[j]) {
						System.out.print(arr1[i]);
						arr2[j]=12345;
						break;
					}
				}
			}
		}

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int arr1[]=new int[n];
			for(int i=0;i<n;i++) {
				arr1[i]=sc.nextInt();
			}
			int m=sc.nextInt();
			int arr2[]=new int[m];
			for(int i=0;i<m;i++) {
				arr2[i]=sc.nextInt();
			}
			intersection(arr1,arr2);
			
				//int ans=intersection(arr1,arr2);
				//System.out.println(ans);
		}

	
}
