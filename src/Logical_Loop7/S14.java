package Logical_Loop7;

import java.util.Scanner;

    public class S14 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
		
	System.out.println("Give The String");
		
	String name=scan.next();
		
	String cname=name.replace("@", "A");
	
	System.out.println(cname);
	}
    }
