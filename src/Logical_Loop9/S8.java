package Logical_Loop9;

    public class S8 {
	public static void main(String[] args) {
		
		String org="987654321";
		String rev="";
		for(int i=org.length()-1;i>0;i--) {
			rev=rev+org.charAt(i);
		}
		System.out.println(rev);
	}
    }
