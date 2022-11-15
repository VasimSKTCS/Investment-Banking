package Logical_Loop4;

public class Sample20 {
	public static void main(String[] args) {
		
		String Name="S H A I K H A M A N ";
		int count=0;
		
		for(int i=0;i<=Name.length()-1;i++) {
			char v=Name.charAt(i);
			if(v==' ') {
				count++;
			}
		}
		System.out.println("Toatl No. Of Spaces"+count);
	}

}
