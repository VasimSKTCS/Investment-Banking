package Logical_Loop8;

    public class S10 {
	public static void main(String[] args) {
		
	String str="SHAIKHDANISH";
	int count=0;
		
	char[] ch=str.toCharArray();
		
	System.out.println("The Dublicate Char are");
		
	for(int i=0;i<str.length();i++) {
	for(int j=i+1;j<str.length();j++) {
	if(ch[i]==ch[j]) {
	System.out.println(ch[i]);
	count++;
	break;
	}
	}
	}
	}
    }
