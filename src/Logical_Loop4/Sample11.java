package Logical_Loop4;

public class Sample11 {
	public static void main(String[] args) {
		
		String org="REFER";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
			if(org.equals(rev)) {
				System.out.println("Given String Is Palindrome");
			}
			else {
				System.out.println("Given String Is Not Palindrome");
			}
		}
	}


