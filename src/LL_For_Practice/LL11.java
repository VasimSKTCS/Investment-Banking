package LL_For_Practice;
    
    public class LL11 {
	public static void main(String[] args) {
		
	String name="WordlBOOk";
	int cc=0;
	int sc=0;
		
    for(int i=0;i<name.length();i++) {
    char ch=name.charAt(i);
    if(ch>='a'&&ch<='z') {
	sc++;
	}
	else if(ch>='A'&&ch<='Z') {
	cc++;
	}
	else {
	continue;
	}			
	}
	System.out.println(cc);
	System.out.println(sc);
	}
    }
