package Logical_Loop4;

public class Sample5 {
	public static void main(String[] args) {
		
		System.out.println("Calculating factorial of 5");
		
		int num=5;
		int fact=1;
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
