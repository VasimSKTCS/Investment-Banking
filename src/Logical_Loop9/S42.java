package Logical_Loop9;

public class S42 {
	public static void main(String[] args) {
		
		String str="VASIMSHAIKH";
		int count=0;
		
		char[] ch=str.toCharArray();
		System.out.println("dublicate char are");
		for(int i=0;i<str.length();i++) {
			for(int j=i+1;j<str.length();j++) {
				if(ch[i]==ch[j]) {
					System.out.println(ch[i]);
					count++;
					
				}
			}
		}
	}

}
