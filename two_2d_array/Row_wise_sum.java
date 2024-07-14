package two_2d_array;

import java.util.Scanner;

public class Row_wise_sum {
	public static void rowWiseSum(int[][] mat) {
		int row=mat.length;
		int col=mat[0].length;
		if(row==0 && col ==0){
			return;
		}
		for(int i=0;i<row;i++){
			int sum=0;
			for(int j=0;j<col;j++){
				sum=sum+mat[i][j];
			}
			System.out.print(sum+" ");
		}
	}

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
		rowWiseSum(arr);

	}

}
