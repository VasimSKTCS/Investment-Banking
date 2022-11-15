package Logical_Loop11;

    public class S11 {
	public static void main(String[] args) {
		
	String name="VASIM";
	String rev="";
		
	for(int i=name.length()-1;i>=0;i--) {
	rev=rev+name.charAt(i);
	}
	System.out.println(rev);
	}
    }
