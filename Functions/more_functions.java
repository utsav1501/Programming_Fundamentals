/**************print_2toN__prime******************/

package Functions;
import java.util.Scanner;
public class more_functions {
	public static boolean isprime(int n) {
		for(int i=2;i<n;i++) {
			if(n%i==0) {
				return false;
			}
		}
		return true;
}
	
	public static void printprimes(int n) {
		for(int i=2;i<n;i++) {
			boolean isIprime=isprime(i);
			if(isIprime) {
				System.out.println(i);
			}
		}
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n=sc.nextInt();
		sc.close();
		printprimes(n);
		
	}
}
//public class more_functions {
//public static void func2()
//{
//    System.out.print("#");
//}
//public static void func1()
//{
//    System.out.print("*");
//    func2();
//}
//public static void main (String[] args) {
//    func2();
//    func1();
//}
//}

