package Logical_Loop9;

import java.util.Scanner;

public class S33 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("Give The String With Multiple SPL SYMBOLE");
		
		String name=scan.next();
		String cname=name.replaceAll("[^a-zA-Z]", "");
		System.out.println(cname);
	}

}
