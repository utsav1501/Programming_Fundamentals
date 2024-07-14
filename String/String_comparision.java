package String;

public class String_comparision {
	public static void main(String[] args) {
//      /String str1="abc";
//		String str2=new String("abc");
//		if(str1.equals(str2)) {           //equals() method compare the content of string	
//			System.out.println("Equal!");
//		}
//		else {
//			System.out.println("Not equal!");
//		}
	
		String str1="abc";
		String str2="bc";
		String str3="a"+str2;
		System.out.println(str3);
		System.out.println(str1==str3);
		System.out.println(str1.equals(str3));

		
		
		
		
		
//		String str="abc";
//		String str1=new String("abc");
//		if(str==str1) {
//			System.out.println("Equal!");
//		}
//		else {
//			System.out.println("Not equal");//Here str1 is not equal to str bcz str1 is created in heap not in string pool
//		}
		
		
		
		
//		String str="abc";
//		String str1="abc";
////		if(str==str1) {
////			System.out.println("equal!");//Here ,both strings are equal due to string pool
////		}
////		else {
////			System.out.println("Not equal");
////		}
	}
}
