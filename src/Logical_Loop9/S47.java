package Logical_Loop9;

public class S47 {
	public static void main(String[] args) {
		
		String name="VEloCiTy";
		int upperc=0;
				int lowerc=0;
				
				for(int i=0;i<name.length();i++) {
					char ch=name.charAt(i);
					if(ch>='A'&&ch<='Z') {
						upperc++;
					}
					else if(ch>='a'&&ch<='z') {
						lowerc++;				
					}
					//else {
						
					//}
					
				}
				System.out.println(upperc);
				System.out.println(lowerc);
	}

}
