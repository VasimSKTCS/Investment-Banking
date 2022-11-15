package Logical_Loop3;

import java.util.Scanner;

public class Scanner3 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		//REPLaCE SYMBOLE WTHI CHAR
		System.out.println("Take String From User");
		String name=scan.next();
		System.out.println(name);
		
		String correct=name.replace("@","A");
		System.out.println(correct);
				
	}

}
