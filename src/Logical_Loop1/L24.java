package Logical_Loop1;

    public class L24 {
	public static void main(String[] args) {
		
	String name="facebookapp";
	int count=0;
		
	char[] ch=name.toCharArray();
	for(int i=0;i<name.length();i++) {
	for(int j=i+1;j<name.length();j++) {
	if(ch[i]==ch[j]) {
	//count++;
	System.out.println(ch[i]);
	}
	}
	}		
	}
    }
