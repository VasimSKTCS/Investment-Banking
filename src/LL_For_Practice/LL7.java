package LL_For_Practice;

    public class LL7 {
	public static void main(String[] args) {
		
	String num="6544465465132198";
		
	for(int i=57;i>=48;i--) {
	for(int j=0;j<=num.length()-1;j++) {
	if(num.charAt(j)==i) {
	System.out.println(num.charAt(j));
	}
	}
	}
	}
    }
