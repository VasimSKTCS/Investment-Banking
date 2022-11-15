package Logical_Loop11;

    public class S37 {
	public static void main(String[] args) {
		
	String name="google";
	int count=0;
		
	System.out.println("Dublicate Char Are");
	char[] ch=name.toCharArray();
	for(int i=0;i<name.length();i++) {
	for(int j=i+1;j<name.length();j++) {
	if(ch[i]==ch[j]) {
	System.out.println(ch[j]);
	count++;
	}
	}
	}
	}
    }
