package Logical_Loop8;

    public class S5 {
	public static void main(String[] args) {
		
	String str="SHAIKHALFIYA";
	int count=0;
		
	char[] ch=str.toCharArray();
	System.out.println("Duplicate char Are");
	for(int i=0;i<str.length();i++) {
	for(int j=1+i;j<str.length();j++) {
	if(ch[i]==ch[j]) {
	System.out.println(ch[i]);
	count++;
	break;
	}
	}
	}
	}
    }
