package Logical_Loop9;

public class S45 {
	public static void main(String[] args) {
		
		//FABONACCY SERIES
		
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
