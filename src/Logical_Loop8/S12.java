package Logical_Loop8;

    public class S12 {
	public static void main(String[] args) {
		
	String str="w3school";
	int count=0;
		
	char[] ch=str.toCharArray();
	System.out.println("Dublicate char are");
	for(int i=0;i<=str.length()-1;i++) {
	for(int j=1+i;j<=str.length()-1;j++) {
	if(ch[i]==ch[j]) {
	System.out.println(ch[i]);
	count++;
	break;
	}
	}
			
    }
	}
    }
