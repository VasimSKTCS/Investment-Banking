package Logical_Loop3;

public class Sample10 {
	public static void main(String[] args) {
		
		String org="VASIM";
		String rev="";
		
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
	}

}
