package Logical_Loop9;

public class S46 {
	public static void main(String[] args) {
		
		int a=0;
		int b=1;
		System.out.print(a+" "+b);
		for(int i=1;i<=10;i++) {
			int c=a+b;
			a=b;
			b=c;
			System.out.println(" "+c);
		}
		
	}

}
