package Logical_Loop3;

public class Sample11 {
	public static void main(String[] args) {
		
		///REVERSEE THE STRING
		
		String org="JULEKHA";
		String rev="";
		for(int i=org.length()-1;i>=0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
	}

}
