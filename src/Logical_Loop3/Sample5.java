package Logical_Loop3;

public class Sample5 {
	public static void main(String[] args) {
		
		System.out.println("Calculating Factorial");
		
		int num=9;
		int fact=1;
		
		for(int i=1;i<=num;i++) {
			fact=fact*i;
		}
		System.out.println(fact);
	}

}
