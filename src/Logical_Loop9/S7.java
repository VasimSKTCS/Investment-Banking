package Logical_Loop9;

    public class S7 {
	
	public static void main(String[] args) {
		 
	String str="vasimshaikh";
	int count=0;
		
	System.out.println("The Dublicate Char Are");
	char[] ch=str.toCharArray();
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
