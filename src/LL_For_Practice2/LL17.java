package LL_For_Practice2;

import java.util.Scanner;

    public class LL17 {
	public static void main(String[] args) {
	int count=0;
	Scanner scan=new Scanner(System.in);
		
	int num=scan.nextInt();
	for(int i=1;i<=num;i++) {
	if(num%i==0) {
	count++;
	}
	}
	if(count==2) {
	System.out.println("Prime");
	}
	else {
	System.out.println("N Prime");
	}				
	}
    }
