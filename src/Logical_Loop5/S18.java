package Logical_Loop5;

public class S18 {
public static void main(String[] args) {
	//Finding prime number
	int num=5;
	int count=0;
	
	for(int i=1;i<=num;i++) {
		if(num%i==0) {
			count++;
		}
	
		if(count==2) {
			System.out.println("given number is prime");
		}
		else {
			System.out.println("given number is not prime");
		}
	}
	}
	
}
	


