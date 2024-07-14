package two_2d_array;
import java.util.Scanner;

public class TakingInput_and_printing_2d_array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows!");
		int row=sc.nextInt();
		System.out.println("Enter number of columns!");
		int column=sc.nextInt();
		int arr[][]=new int[row][column];
		//Taking input
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		//printing output
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}

	}

}
