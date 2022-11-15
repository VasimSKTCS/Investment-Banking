package LL_For_Practice;

    public class LL4 {
	public static void main(String[] args) {
		
	String name="zyxmnoabc";
		
	for(int i=97;i<=122;i++) {
	for(int j=0;j<name.length();j++) {
	if(name.charAt(j)==i) {
	System.out.println(name.charAt(j));
	}
	}
	}
	}
    } 
