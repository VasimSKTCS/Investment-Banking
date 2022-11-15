package Logical_Loop4;

public class Sample22 {
public static void main(String[] args) {
	
	System.out.println("Finding The white Spaces");
	
	String name="V A S I M";
	int count=0;
	
	for(int i=4;i<=name.length()-1;i++) {	
	char v=name.charAt(i);	
    if(v==' ') {
	count++;
	}
	}
	
	System.out.println(count);
	
    }
	}


