package Logical_Loop1;

    public class L29 {
	public static void main(String[] args) {
		
	String num="9096841423";
		
	for(int i=57;i>=48;i--) {
	for(int j=0;j<num.length();j++) {
	//char ch=num.charAt(i);
	if(num.charAt(j)==i) {
	System.out.println(num.charAt(j));
	}
	}
	}
	}
    }
