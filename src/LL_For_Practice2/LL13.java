package LL_For_Practice2;

    public class LL13 {
	public static void main(String[] args) {
		
	int a=0;
	int b=1;
	System.out.print(a+" "+b);
	for(int i=1;i<=10;i++) {
	int c=a+b;
	System.out.println(" "+c);
	a=b;
	b=c;
			
	}
	}
    }
