package Logical_Loop1;

    public class L7 {
	public static void main(String[] args) {
		
	int a=500;
	int b=750;
		
	System.out.println("Before Swapping"+a+" "+b);	
		a=a+b;
		b=a-b;
		a=a-b;
	System.out.println("After Swapping:"+"="+a+"AND"+b);
	}
    }
