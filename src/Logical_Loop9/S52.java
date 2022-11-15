package Logical_Loop9;

public class S52 {
	public static void main(String[] args) {
		
		String str="I Am Fro m Vaijapur";
		int count=0;
		
		for(int i=0;i<str.length();i++) {
			char ch=str.charAt(i);
			if(ch==' ') {
				count++;
			}
		}
		System.out.println(count);
		
	}

}
