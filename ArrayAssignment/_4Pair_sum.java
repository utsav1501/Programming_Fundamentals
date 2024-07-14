package ArrayAssignment;
import java.util.Scanner;
public class _4Pair_sum {


	public static int pairSum(int arr[],int x) {
			int count=0;
			for(int i=0;i<arr.length-1;i++) {
				for(int j=i+1;j<arr.length;j++) {
					if(arr[i]+arr[j]==x) {
						count++;
						break;
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
			int store=pairSum(arr,x);
			System.out.println(store);
		}

	}
