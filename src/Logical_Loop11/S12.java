package Logical_Loop11;

    public class S12 {
	public static void main(String[] args) {
		
	String name="DAD";
	String rev="";
		
	for(int i=name.length()-1;i>=0;i--) {
	rev=rev+name.charAt(i);	
	}
	System.out.println(rev);
	if(name.equals(rev)) {
    System.out.println("Palindrome");
	}
	else {
	System.out.println("Not Palindrome");
	}						
	}
    }
