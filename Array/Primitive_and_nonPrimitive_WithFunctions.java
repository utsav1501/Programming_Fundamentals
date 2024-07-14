package Array;
import java.util.Scanner;
public class Primitive_and_nonPrimitive_WithFunctions {
	
	public static void print(int arr[]) {
		int size=arr.length;
		for(int i=0;i<size;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	
	
	public static void incrementArray(int input[]) {
		input=new int[5];
		for(int i=0;i<input.length;i++) {
			input[i]++;
		}
	}
	
	
	
//	public static void increment(int i) {
//		i++;
//	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
//		int i=10;
//		increment(i);
//		System.out.println(i);
		
		int arr[]= {1,2,3,4,5};
		incrementArray(arr);
		print(arr);

	}

}
