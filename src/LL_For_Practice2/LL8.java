package LL_For_Practice2;

    public class LL8 {
	public static void main(String[] args) {
		
	String name="121";
	String rev="";
		
	for(int i=name.length()-1;i>=0;i--) {
	rev=rev+name.charAt(i);
	}
	System.out.println(rev);
	if(rev.equals(name)) {
	System.out.println("Palindrome");
	}
	else {
	System.out.println("Not Palindrome");
	}		
	}
    }
