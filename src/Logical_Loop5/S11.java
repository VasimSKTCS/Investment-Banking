package Logical_Loop5;

public class S11 {
	public static void main(String[] args) {
		
		System.out.println("Revers The String And Checking Weather It Is Palindrome Or Not");
		
		String org="ADAM";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		
		System.out.println(rev);
		}
		if(org.equals(rev)) {
			System.out.println("Given String Is Palindrome");
		}
		else {
			System.out.println("Given String Is Not Palindrome");
		}
		}
	}


