package two_2d_array;
import java.util.Scanner;

public class Largest_sum_of_columns {
	public static int[][] taking_input(){
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter number of rows!");
		int row=sc.nextInt();
		System.out.println("Enter number of columns!");
		int column=sc.nextInt();
		int arr[][]=new int[row][column];
		for(int i=0;i<row;i++) {
			for(int j=0;j<column;j++) {
				arr[i][j]=sc.nextInt();
			}
		}
		return arr;
	}
	public static void print(int[][] input) {
		int rows=input.length;//NO of rows
		int cols=input[0].length;//since length of all columns is same
		for(int i=0;i<rows;i++) {
			for(int j=0;j<cols;j++) {
				System.out.print(input[i][j]+" ");
			}
			System.out.println();
		}
	}
	public static int largestcolsum(int input[][]) {
		int rows=input.length;
		int maximum=Integer.MIN_VALUE;
		int cols=input[0].length;
		for(int j=0;j<cols;j++) {
			int sum=0;
			for(int i=0;i<rows;i++) {
				sum=sum+input[i][j];
			}
			if(sum>maximum) {
				maximum=sum;
			}
		}
		return maximum;
	}

	public static void main(String[] args) {
		int input[][]=taking_input();
		print(input);
		System.out.println(largestcolsum(input));

	}

}
