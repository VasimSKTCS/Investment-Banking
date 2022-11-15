package LL_For_Practice;

    public class LL5 {
	public static void main(String[] args) {
		
	String name="abcdef0";
		
    for(int i=122;i>=97;i--) {
	for(int j=0;j<name.length();j++) {
	if(name.charAt(j)==i) {
	System.out.println(name.charAt(j));
	}
	}
	}
	}
    }
