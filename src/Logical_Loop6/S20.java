package Logical_Loop6;

import java.util.Scanner;

    public class S20 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	
	String rev="";
		
	String name=scan.nextLine();
		
	for(int i=name.length()-1;i>=0;i--) {
	rev=rev+name.charAt(i);
	}
	
	System.out.println(rev);
	
	}
    }
