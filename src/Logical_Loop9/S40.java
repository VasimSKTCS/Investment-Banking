package Logical_Loop9;

public class S40 {
	public static void main(String[] args) {
		
		String name="V A S I M";
		int count=0;
		//for(int i=0;i<name.length();i++) {
		for(int i=name.length()-1;i>=0;i--) {
			char ch=name.charAt(i);
			if(ch==' ') {
				count++;
			}
			
		}
		System.out.println(count);
	}

}
