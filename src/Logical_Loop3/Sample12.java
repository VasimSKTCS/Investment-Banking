package Logical_Loop3;

public class Sample12 {
public static void main(String[] args) {
	
	//revers the string and find it is palindrome or not
	
	String org="DAD";
	String rev="";
	
	for(int i=org.length()-1;i>=0;i--) {
		rev=rev+org.charAt(i);
				
	}
	System.out.println(rev);
	if(org.equals(rev)) {
		System.out.println("Given String Is Palindrome");
	}
	else {
		System.out.println("given string is not palindrome");
	}
	
}
}
