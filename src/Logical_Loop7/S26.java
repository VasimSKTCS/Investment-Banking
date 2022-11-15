package Logical_Loop7;

    public class S26 {
	public static void main(String[] args) {
		
	String name="BeginnerBook";
	int vcount=0;
	int ccount=0;
		
	name=name.toLowerCase();
	
	for(int i=0;i<name.length();i++) {
	char ch=name.charAt(i);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
	vcount++;
	}
	else if((ch>='a'&&ch<='z')) {
	ccount++;
	}
	}
	System.out.println(vcount);
	System.out.println(ccount);
	}
    }
