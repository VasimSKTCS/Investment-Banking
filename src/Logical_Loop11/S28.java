package Logical_Loop11;

import java.util.Scanner;

    public class S28 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
	int count=0;
	System.out.println("Give The Name");
	String name=scan.nextLine();
	System.out.println(name);
		
	for(int i=0;i<name.length();i++) {
	char ch=name.charAt(i);	
	if(ch==' ') {
	count++;
	}
	}
	System.out.println(count);		
	}
    }
