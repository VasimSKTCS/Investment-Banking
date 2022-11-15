package Logical_Loop4;

public class Sample9 {
public static void main(String[] args) {
	
	System.out.println("Swapping Without Using Third Variable");
	//Before Swapping
	int a=105;
	int b=780;
	
	//After Swapping
	a=a+b;
	b=a-b;//105
	a=a-b;//780
	System.out.println("After Swwapping:"+a+"AND"+b);
}
}
