package Logical_Loop3;

public class Sample14 {
public static void main(String[] args) {
	
	String name="V@*A%%%%%%#S&I***M";//VASIM
	
	String correctname=name.replaceAll("[^a-zA-Z]","");
	System.out.println(correctname);
}
}
