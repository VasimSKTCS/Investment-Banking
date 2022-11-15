package Logical_Loop11;

    public class S39 {
	public static void main(String[] args) {
		
	String name="BigginersBook";
	int ccount=0;
	int vcount=0;
		
    name=name.toLowerCase();
	for(int i=0;i<name.length();i++) {
    char ch=name.charAt(i);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
	vcount++;
	}
	else if(ch>='a'&&ch<='z') {
	ccount++;
	}
	}
	System.out.println("Vovels Count"+" "+"="+vcount);
	System.out.println("Consonunt Count"+" "+"="+ccount);
	}
    }
