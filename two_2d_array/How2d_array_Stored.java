package two_2d_array;

public class How2d_array_Stored {

	public static void main(String[] args) {
		int arr[][]= {{1,2,3},{4,5,6}};
		System.out.println(arr);  //output:[[I@34c45dca
		System.out.println(arr.length);
		System.out.println(arr[1].length);//arr[1] represent 2nd row & arr[0] represent 1st row
		for(int i=0;i<2;i++) {
			System.out.println(arr[i]);//address of 0th and 1st row
			System.out.println(arr[i].length);
		}
		

	}

}
