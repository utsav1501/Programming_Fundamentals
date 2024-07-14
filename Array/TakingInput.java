package Array;
import java.util.Scanner;
public class TakingInput {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		//int arr[]=new int[size];
			//Taking input
//		for(int i=0;i<size;i++) {
//				arr[i]=sc.nextInt();
//				}
		
				//printing Output
//		for(int i=0;i<size;i++) {
//			System.out.print(arr[i]+ "  ");
//		}
		char arr[]=new char[size];
		for(int i=0;i<size;i++) {
			arr[i]=sc.next().charAt(0);
			}
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+ "  ");
		}
		
		
	}

}
