package Logical_Loop8;

    public class S11 {
	public static void main(String[] args) {
		
	String str="BegginersBook";
	int vcount=0;
	int ccount=0;
		
	//Frist We Have To Convert All Char In lowercase
	str=str.toLowerCase();
	for(int i=0;i<str.length()-1;i++) {
	char ch=str.charAt(i);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
	vcount++;
	}
	else if((ch>='a' && ch<='z')) {
	ccount++;
	}
			
    }
	System.out.println("No. Of Vowels"+ vcount);
	System.out.println("No. Of Consonant"+ccount);
	}
    }
