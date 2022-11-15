package Logical_Loop3;

public class Sample199 {
public static void main(String[] args) {
	
	String name="V A S I M S H A I K H";
	int count=0;
	
	for(int i=0;i<=name.length()-1;i++) {
		char v=name.charAt(i);
		if(v==' ') {
		count++;
	}
	}
	System.out.println("total number of spaces"+count);
}
}
