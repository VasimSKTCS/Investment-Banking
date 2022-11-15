package LL_For_Practice;

    public class LL10 {
	public static void main(String[] args) {
		
	String name="W3school";
		
	char[] ch=name.toCharArray();
	for(int i=0;i<name.length();i++) {
    for(int j=i+1;j<name.length();j++) {
    if(ch[i]==ch[j]) {
	System.out.println(ch[i]);
	}
	}
    }
	}
    }
