package Logical_Loop2;

    public class S10 {
	public static void main(String[] args) {
		
	//REVERSE THE STRING
		
	String name="VASIM";
	String rev="";
		
	for(int i=name.length()-1;i>=0;i--) {
	rev=rev+name.charAt(i);
	System.out.println(rev);
	}
	
	System.out.println(rev);
		
	}
    }
