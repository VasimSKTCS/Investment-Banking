package Logical_Loop4;

import java.util.Scanner;

public class Sample16 {
public static void main(String[] args) {
	
//replace the special symbol by char
	System.out.println("Write The String With Special Char");
	Scanner scan=new Scanner(System.in);
	
       String name=scan.next();
       //System.out.println(name);
       
       System.out.println("Repacle Special Symbol By Char");
       String correct=name.replace("@","a");
       System.out.println(correct);
       
       
	}

}
