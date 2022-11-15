package Logical_Loop4;

import java.util.Scanner;

public class Sample21 {
public static void main(String[] args) {
	int count=0;
	Scanner scan=new Scanner(System.in);
	
	System.out.println("Ley User Write The String With White Spaces");
	
	String name=scan.nextLine();
	
	System.out.println(name);
	
	for(int i=0;i<=name.length()-1;i++) {
		char v=name.charAt(i);
			if(v==' '){
			count ++;
		}
	}
	System.out.println(count);


	}

	
}


