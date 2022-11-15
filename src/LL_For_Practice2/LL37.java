package LL_For_Practice2;

    public class LL37 {
	public static void main(String[] args) {
		
	String name="VasImSHaikh";
	int upp=0;
	int low=0;
		
	for(int i=0;i<name.length();i++) {
	char ch=name.charAt(i);		
	if(ch>='A'&&ch<='Z') {
	upp++;
	}
	else if(ch>='a'&&ch<='z') {
	low++;
	}
	else {
	continue;
	}
	}
	System.out.println("Count Of Upper Case:-"+upp);
	System.out.println("Count Of Lower Case:-"+low);
	}
    }
