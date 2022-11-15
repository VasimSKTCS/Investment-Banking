package Logical_Loop1;

    public class L30 {
	public static void main(String[] args) {
		
	System.out.println("Print Number In Ascending Order");
		
	String num="987654321";
		
	for(int i=48;i<=57;i++) {
	for(int j=0;j<num.length();j++) {
	if(num.charAt(j)==i) {
	System.out.println(num.charAt(j));
	}
	}
	}
	}
    }
