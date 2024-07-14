package Array_codeStudio;
import java.util.Scanner;
public class Rotate_array {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();//array length
	int arr[]=new int[n];
	for(int i=0;i<n;i++){
		arr[i]=sc.nextInt();
	}
	int k=sc.nextInt();//array t0 be shifted at what position
	int temp[]=new int[n];
	for(int i=0;i<n;i++){
		temp[(i+k)%n]=arr[i];
		
	}
	for(int i=0;i<n;i++){
		System.out.print(temp[i]+" ");
	}
		
}
}
