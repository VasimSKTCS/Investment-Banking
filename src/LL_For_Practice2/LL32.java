package LL_For_Practice2;

    public class LL32 {
	public static void main(String[] args) {
		
	String abc="jhgsascuyvsccuyqeiqsbccasc";
	for(int i=97;i<=122;i++) {
	for(int j=0;j<abc.length();j++) {
	if(abc.charAt(j)==i) {
	System.out.println(abc.charAt(j));
    }
	}
	}
	}
    }
