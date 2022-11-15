package Logical_Loop5;

import java.util.Scanner;

public class S15 {
public static void main(String[] args) {
	
	//remove special symbole
	
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Hey User Give Name with spl symbole");
	
	String name=scan.next();
	
	System.out.println("Change spl Symbole By Char");
	
	String correct=name.replace("#", "A");
	System.out.println(correct);
}
}
