package Logical_Loop9;

import java.util.Scanner;

public class S31 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Give The name With Spl Char");
		
		String name=scan.next();
		String cname=name.replace("@", "A");
		System.out.println(cname);
		
	}

}
