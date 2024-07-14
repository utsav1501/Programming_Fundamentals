package Functions;
import java.util.Scanner;
public class fah_to_cel {
	public static void printFahrenheitTable(int start, int end, int step) {
		int c;
		
		for(int i=start;i<=end;i+=step){
			c=(5*(i-32))/9;
			System.out.println(i+"	"+c);
		}
		
	}

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int start=sc.nextInt();
		int end=sc.nextInt();
		int step=sc.nextInt();
		printFahrenheitTable(start,end,step);

	}

}
