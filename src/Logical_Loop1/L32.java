package Logical_Loop1;

    public class L32 {
	public static void main(String[] args) {
		
	System.out.println("Printing Alphabets In decending Order");
	String name="ajadojaodovaovjaoz";
	for(int i=122;i>=97;i--) {
	for(int j=0;j<=name.length()-1;j++) {
	if(name.charAt(j)==i) {
	System.out.println(name.charAt(j));
	}
	}
	}
	}
    }
