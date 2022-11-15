package Logical_Loop7;

import java.util.Scanner;

    public class S25 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
		 
	String rev="";
		
	String name=scan.nextLine();
		
	for(int i=name.length()-1;i>=0;i--) {
	rev=rev+name.charAt(i);
	}
	
    if(name.equals(rev)) {
	System.out.println("Palindrom");			
	}
    
	else {
	System.out.println("Not Palindorm");
	}
    
	}
    }
