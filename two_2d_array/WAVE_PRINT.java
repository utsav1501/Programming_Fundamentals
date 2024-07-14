package two_2d_array;
import java.util.Scanner;

import java.util.Scanner;

public class WAVE_PRINT {
	public static void wavePrint(int mat[][]){
		int row=mat.length;
		int column=mat[0].length;
		for(int j=0;j<column;j++){
			if(j%2!=0){
			//odd->bottom to top
			for(int i=row-1;i>=0;i--){
				System.out.print(mat[i][j]+" ");
			}
		}
		else{
			// 0 or even index ->top to bottom
			for(int i=0;i<row;i++){
				System.out.print(mat[i][j]+" ");
			}
		}
	}
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
		wavePrint(arr);

	}

}
