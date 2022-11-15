package LL_For_Practice;

    public class LL12 {
	public static void main(String[] args) {
		
	String name="BigginersBbook";
	int vc=0;
	int cc=0;
	name=name.toLowerCase();
		
	for(int i=0;i<name.length();i++) {
	char ch=name.charAt(i);
	if(ch=='i'||ch=='a'||ch=='e'||ch=='o'||ch=='u') {
	cc++;
	}
	else if(ch>='a'&&ch<='z') {
	vc++;
	}
	}
    System.out.println(cc);
	System.out.println(vc);
	}
	}
    
