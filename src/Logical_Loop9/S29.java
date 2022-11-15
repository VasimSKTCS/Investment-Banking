package Logical_Loop9;

import java.util.Scanner;

public class S29 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Give The Number");
		
		int num=scan.nextInt();
		
		if(num%2==0) {
			System.out.println("Number Is Prime Number");
		}
		else {
			System.out.println("Number Is Odd Number");
		}
	}

}
