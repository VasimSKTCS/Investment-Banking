package Logical_Loop5;

public class S10 {
	public static void main(String[] args) {
		
		System.out.println("Reverse The String");
		
		String org="VASIM";
		String rev="";
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
			System.out.println(rev);
		
	}

}
