package Logical_Loop10;

import java.util.Scanner;

public class S6 {
	public static void main(String[] args) {
		int rev=0;
		int a;
		int r;
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter the number");
		
		int num=scan.nextInt();
		a=num;
		while(num>0) {
		r=num%10;
		rev=rev*10+r;
		num=num/10;
		}
		System.out.println(rev);
	}
	

}
