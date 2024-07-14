package Array;
import java.util.Scanner;
public class using_function {
	public static int[] takeinput() {//we have to return an array so we write int[]
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
		return arr;//you just have to write var/array name
	}
	public static void print(int arr[]) {
		//int size=input.length
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	public static void main(String[] args) {
		int arr[]=takeinput();
		print(arr);		
	}

}
