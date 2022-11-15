package Logical_Loop8;

public class S29 {
	public static void main(String[] args) {
		
		String str="WellComeToVeloCity";
		int upperc=0;
		int lowerc=0;
		
		for(int i=0;i<=str.length()-1;i++) {
			char ch=str.charAt(i);
			if(ch>='A'&&ch<='Z') {
				upperc++;
			}
			else if(ch>='a'&&ch<='z') {
				lowerc++;
				
			}
			else {
				continue;
			}
		}
			System.out.println(upperc);
			
			System.out.println(lowerc);
			
		
	}

}
