package Logical_Loop6;

    public class S11 {
	public static void main(String[] args) {
		
	String org="DAD";
	String rev="";
		
	for(int i=org.length()-1;i>=1;i--) {
	rev=rev+org.charAt(i);
    }
			
	System.out.println(rev);
	
	if(org.equals(rev)) {
	System.out.println("Geven String Is Palindrome");
	}
	
	else {
	System.out.println("Given String Is Not Palindrome");
	}
	
	}
    }
