package LL_For_Practice2;

import java.util.Scanner;

    public class LL25 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
		
	System.out.println("Give String");
		
	String name=scan.next();
	System.out.println(name);
	String cname=name.replaceAll("[^a-zA-Z]", "");
	System.out.println(cname);				
	}
    }
