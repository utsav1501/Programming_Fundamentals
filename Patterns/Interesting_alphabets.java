package Patterns;
import java.util.Scanner;
public class Interesting_alphabets {
	public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int n=sc.nextInt();
			int i=1;
			while(i<=n){
				char ch=(char)('A'+n-i);
				int j=1;
				while(j<=i){
					System.out.print(ch);
					ch++;
					j++;
				}
				System.out.println();
				i++;;
			}
		}
	}

