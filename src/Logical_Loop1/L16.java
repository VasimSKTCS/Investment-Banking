package Logical_Loop1;

    public class L16 {
	public static void main(String[] args) {
		
	String name="V A S I M";
	int count=0;
		
	for(int i=0;i<name.length();i++) {
	char ch=name.charAt(i);
	if(ch==' ') {
	count++;
	}
	}
	System.out.println(count);
	}
    }
