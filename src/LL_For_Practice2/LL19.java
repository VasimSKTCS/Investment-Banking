package LL_For_Practice2;

import java.util.Scanner;

    public class LL19 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Give The Number");
	
	int num=scan.nextInt();
	
	int actnum=num;
	int r=0;
	int armnum=0;
		
	
		
	while(num>0) {
	r=num%10;
	armnum=r*r*r+armnum;
	num=num/10;
	}
	
	if(armnum==actnum) {
	System.out.println("Armst");
	}
	
	else {
	System.out.println("n Arm");
	}
	
	}
    }
