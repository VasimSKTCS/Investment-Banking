package Logical_Loop2;

import java.util.Scanner;

    public class S15 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
		
	System.out.println("Ley User Give The Name");
		
	String name=scan.next();
		
	System.out.println(name);
		
	String correct=name.replace("@", "A");
	System.out.println(correct);
	}
    }
