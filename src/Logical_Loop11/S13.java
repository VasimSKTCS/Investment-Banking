package Logical_Loop11;

    public class S13 {
	public static void main(String[] args) {
		
	String num="12345";
	String rev="";
		
	for(int i=num.length()-1;i>=0;i--) {
	rev=rev+num.charAt(i);
	}
	System.out.println(rev);
	}
    }
