package Logical_Loop9;

public class S43 {
	public static void main(String[] args) {
		
		String str="BeeginersBook";
		int vcount=0;
		int ccount=0;
		//first we convert all in lower case
		str=str.toLowerCase();
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				vcount++;
			}
			else if((ch>='a'&&ch<='z')) {
				ccount++;
			}
			}
			System.out.println("VOVELS COUNT:"+vcount);
			System.out.println("CONSONENT COUNT:"+ccount);
		}
	}


