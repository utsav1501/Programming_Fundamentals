package two_2d_array;
import java.util.Scanner;

public class sum_of_boundaries_and_diagonals {
	public static void totalSum(int[][] mat) {
	int n=mat.length;
	int sum=0;
	for(int i=0;i<n;i++){
		sum+=mat[0][i];
		sum+=mat[n-1][i];
	}
	for(int i=1;i<n-1;i++){
		sum+=mat[i][0];
		sum+=mat[i][n-1];
	}
	for(int i=1;i<n-1;i++){
		sum+=mat[i][i];
		sum+=mat[i][n-1-i];
	}
	if(n%2!=0){
		sum-=mat[n/2][n/2];
	}
	System.out.println(sum);
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int row=sc.nextInt();
		int column=sc.nextInt();
		int arr[][]=new int[row][column];
		//Taking input
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		totalSum(arr);

	}

}
