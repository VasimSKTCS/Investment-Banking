package Logical_Loop9;

public class S22 {
public static void main(String[] args) {
	
	
	String org="VASIM";
	String rev="";
	
	for(int i=org.length()-1;i>=0;i--) {
		rev=rev+org.charAt(i);
	}
	System.out.println(rev);
	
	
}
}
