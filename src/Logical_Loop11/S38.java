package Logical_Loop11;

    public class S38 {
	public static void main(String[] args) {
		
	String name="vaSIM";
	int ccount=0;
	int scount=0;
		
	for(int i=0;i<name.length();i++) {
	char ch=name.charAt(i);
	if(ch>='A'&&ch<='Z') {
	ccount++;
	}
	else if(ch>='a'&&ch<='z') {
	scount++;
	}
	else {
	continue;
	}
	}
	System.out.println("Uppercase Char Are"+"="+" "+ccount);
	System.out.println("Lowercase Char Are"+"="+" "+scount);
	}
    }
