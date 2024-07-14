package Patterns;
import java.util.Scanner;

public class Reverse_number_pattern {
	
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int i = 1;
			
			while (i <= n) {
				int j = 1;
				int top = i;
				while (j <= i) {
					System.out.print(top);
					j++;
					top--;
				}
				System.out.println();
				i++;
			}

		}

	}

