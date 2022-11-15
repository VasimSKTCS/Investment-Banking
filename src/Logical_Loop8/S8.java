package Logical_Loop8;

    public class S8 {
	public static void main(String[] args) {
		
	int a=0;
	int b=1;
	int c;
		
	System.out.print(a+" "+b);
		
	for(int i=1;i<=15;i++) {
    c=a+b;  
    a=b;
	b=c;
	System.out.println(" "+c);
	
	}
	
	}
    }
