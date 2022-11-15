package Logical_Loop4;

public class Sample8 {
public static void main(String[] args) {
	
	System.out.println("Before Sawpping A=25 ANd B=65");
	//using third variable
	int a=25;
	int b=65;
	
	int c=a;
	a=b;
	b=c;
	
	System.out.println("After Swapping"+a+"and"+b);
}
}
