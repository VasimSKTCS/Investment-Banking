package Logical_Loop8;

    public class S1 {
	public static void main(String[] args) {
		
	String str="w3schools";
	int count=0;
	char[] ch=str.toCharArray();
	System.out.println("Duplicate Char Are");
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
