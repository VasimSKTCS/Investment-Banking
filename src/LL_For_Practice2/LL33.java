package LL_For_Practice2;

    public class LL33 {
	public static void main(String[] args) {
		
	String abc="naduyaffqukncbhlknzaewxcvloutrc";
	for(int i=122;i>=97;i--) {
	for(int j=0;j<abc.length();j++) {
	if(abc.charAt(j)==i) {
	System.out.println(abc.charAt(j));
	}
    }
	}
	}
    } 
