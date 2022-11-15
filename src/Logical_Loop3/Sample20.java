package Logical_Loop3;

import java.util.Scanner;

public class Sample20 {
public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
	System.out.println("String Having Special Symbol");
	//String name="V@@a#%Si&*#@m";
	String Name=scan.next();
	
	String correct=Name.replaceAll("[^a-bA-B]",
			"");
	System.out.println(correct);
}
}
