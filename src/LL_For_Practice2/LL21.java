package LL_For_Practice2;

import java.util.Scanner;

    public class LL21 {
	public static void main(String[] args) {
	
	int count=0;
	Scanner scan=new Scanner(System.in);
	System.out.println("Give The String");
		
	String name=scan.nextLine();
    for(int i=0;i<=name.length()-1;i++) {
	char ch=name.charAt(i);
	if(ch==' ') {
	count++;
	}		
	}
	System.out.println(count);		
	}
    }
