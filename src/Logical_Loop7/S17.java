package Logical_Loop7;

import java.util.Scanner;

    public class S17 {
	public static void main(String[] args) {
	String rev="";
	
	Scanner scan=new Scanner(System.in);
		
	String name=scan.next();
		
	for(int i=name.length()-1;i>=0;i--) {
	rev=rev+name.charAt(i);
	}
	System.out.println(rev);
		
	}
    }
