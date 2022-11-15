package Logical_Loop11;

import java.util.Scanner;

    public class S23 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
		
		
    System.out.println("Replace The Multiple Spl Char");
		
	String Name=scan.next();
	System.out.println(Name);
	String CName=Name.replaceAll("[^a-zA-Z]", "");
	System.out.println(CName);
	}
    }
