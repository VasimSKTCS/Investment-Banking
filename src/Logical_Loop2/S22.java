package Logical_Loop2;

import java.util.Scanner;

    public class S22 {
	public static void main(String[] args) {
	String rev="";
	System.out.println("Ley User Give The String");
	Scanner scan=new Scanner(System.in);
	
	String name=scan.nextLine();
	
	System.out.println(name);
	
	for(int i=name.length()-1;i>=0;i--) {
	rev=rev+name.charAt(i);
	}
	
	System.out.println(rev);
			
	}
    }
