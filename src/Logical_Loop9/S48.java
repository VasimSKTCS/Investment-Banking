package Logical_Loop9;

public class S48 {
	public static void main(String[] args) {
		
		String name="VAsImSHaIKh";
		int ucount=0;
		int lcount=0;
		for(int i=0;i<name.length()-1;i++) {
			char ch=name.charAt(i);
			if(ch>='A'&&ch<='Z') {
				ucount++;
			}
			else if(ch>='a'&&ch<='z') {
				lcount++;
			}
			else {
				continue;
			}
			
		}
		System.out.println(ucount);
		System.out.println(lcount);
	}

}
