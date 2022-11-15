package Logical_Loop6;

import java.util.Scanner;

    public class S19 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
		
	String name=scan.next();
		
	String cname=name.replaceAll("[^a-zA-Z]", "");
	
	System.out.println(cname);
	}
    }
