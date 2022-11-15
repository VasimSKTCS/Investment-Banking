package LL_For_Practice2;

    public class LL31 {
	public static void main(String[] args) {
		
	String num="65486412319878949";
	for(int i=58;i>=47;i--) {
	for(int j=0;j<num.length();j++) {
	if(num.charAt(j)==i) {
	System.out.println(num.charAt(j));
	}
	}
	}
	}
    }
