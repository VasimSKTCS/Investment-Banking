package LL_For_Practice2;

import java.util.Scanner;

    public class LL23 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Give The String");
		
	String name=scan.next();
	System.out.println(name);
	String cname=name.replace("&", "S");
	System.out.println(cname);
	}
    }
