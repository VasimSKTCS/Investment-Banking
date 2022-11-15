package Logical_Loop1;

    public class L31 {
	public static void main(String[] args) {
		
	System.out.println("Print Numbers In Ascending Orders");
		
	String name="qwersadfghmncjd";
		
	for(int i=97;i<=122;i++) {
	for(int j=0;j<name.length();j++) {
	if(name.charAt(j)==i) {
	System.out.println(name.charAt(j));
	}
	}
	}
	}
    }
