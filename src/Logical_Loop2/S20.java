package Logical_Loop2;

    public class S20 {
	public static void main(String[] args) {
		
	String name="V A S I M";
	int count=0;
	
	for(int i=0;i<=name.length()-1;i++) {
	char v=name.charAt(i);
	if(v==' ') {
	count++;
	}
	}
	
	System.out.println("Total Number Of Spaces"+count);
	
	}
    }
