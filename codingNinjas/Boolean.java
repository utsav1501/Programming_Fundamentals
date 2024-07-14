package codingNinjas;
import java.util.Scanner;

public class Boolean {
		public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int i=sc.nextInt();
		int j=sc.nextInt();
		
		boolean iseqal = (i==j);
		boolean noteqal =(i!=j);
		boolean isgr = (i>j);
		boolean isgreq = (i>=j);
		boolean isless = (i<j);
		boolean islesseq =(i<=j);
		
		System.out.println(iseqal);
		System.out.println(noteqal);
		System.out.println(isgr);
		System.out.println(isgreq);
		System.out.println(isless);
		System.out.println(islesseq);

	}

}
