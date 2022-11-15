package LL_For_Practice;

    public class LL6 {
	public static void main(String[] args) {
		
	String num="545468688";
		
	for(int i=48;i<=57;i++) {
	for(int j=0;j<num.length();j++) {
    if(num.charAt(j)==i) {
	System.out.println(num.charAt(j));
	}
	}
    }
	}
    }
