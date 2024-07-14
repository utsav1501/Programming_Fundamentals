package Breakandcontinue;
import java.util.*;

public class Table_continue {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	int n=sc.nextInt();
	sc.close();
	for(int i=1;i<=10;i++) {
		if(i==5) {
			continue;
		}
		System.out.print(i*n+" ");
	}
	
}
}
