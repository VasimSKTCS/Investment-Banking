package Logical_Loop8;

    public class S9 {
	public static void main(String[] args) {
		
	String str="VeLoCity";
	int uppercount=0;
	int lowercount=0;
		
	for(int i=0;i<=str.length()-1;i++) {
	char ch=str.charAt(i);
			
	if(ch>='A' && ch<='Z') {
	uppercount++;
	}
	else if(ch>='a' && ch<='z') {
	lowercount++;
	}
	else {
	continue;
	}
	}
	System.out.println(uppercount);
	System.out.println(lowercount);
	
	}
    }
