package Logical_Loop7;

import java.util.Scanner;

    public class S16 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
		
	String name=scan.next();
	String cname=name.replaceAll("[^a-zA-Z]", "");
		
	System.out.println(cname);
									
	}
    }
