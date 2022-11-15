package Logical_Loop5;

import java.util.Scanner;

public class S16 {
	public static void main(String[] args) {
		
		//remove multiple spl symbole
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Name Having Multiple spl symbole");
		
		String name=scan.next();
		
		System.out.println("Replace spl char");
		String repl=name.replaceAll("[^a-zA-Z]"," ");
		System.out.println(repl);
		
		
	}

}
