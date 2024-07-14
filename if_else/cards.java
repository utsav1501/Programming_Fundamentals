package if_else;

public class cards {
	public static void main(String[] args) {
		int a=500000;
		int b=2000;
		if(a>b) {
			if(a>100) 
			System.out.println("Ace");
			if(b<111100)
				b=50;
			System.out.println(b);
			
		}
		else if(a==b) {
			System.out.println("king");
		}
		else {
			System.out.println("Queen");
		}
		
	}

}
