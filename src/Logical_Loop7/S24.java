package Logical_Loop7;

import java.util.Scanner;

    public class S24 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
		
	int count=0;
	
	String name=scan.nextLine();
		
	for(int i=0;i<=name.length()-1;i++) {
	char v=name.charAt(i);
	if(v==' ') {
	count++;	
	}
	}
	System.out.println(count);
	}
	}
