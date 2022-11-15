package Logical_Loop5;

import java.util.Scanner;

public class S14 {
	public static void main(String[] args) {
		
		//Accepting Even And Odd Number
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Hey User Give The Number");
		
		int num=scan.nextInt();
		System.out.println("Finding weather it is even or odd");
	
	if(num%2==0) {
		System.out.println("Given Number Is Even Number");
	}
	else {
		System.out.println("Given Number Is Odd Number");
	}
	}
}
