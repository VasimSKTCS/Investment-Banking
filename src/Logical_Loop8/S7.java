package Logical_Loop8;

    public class S7 {
	public static void main(String[] args) {
		
	int a=0;
	int b=1;
	int c;
	int count=10;
	System.out.print(a+" "+b);		
	for(int i=0;i<=count;i++) {
	c=a+b;
	a=b;
	b=c;
	System.out.println(" "+c);
	}
	
	}
    }
