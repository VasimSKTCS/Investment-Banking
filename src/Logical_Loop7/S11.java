package Logical_Loop7;

    public class S11 {
	public static void main(String[] args) {
		
	String org="DAD";
	String rev="";
		
	for(int i=org.length()-1;i>=0;i--) {
	rev=rev+org.charAt(i);
	}
	
	System.out.println(rev);
	
	if(org.equals(rev)) {
	System.out.println("Palindrome");
	}
	
	else {
	System.out.println("Not Palindrom");
	}
	
	}
    }
