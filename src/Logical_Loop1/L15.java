package Logical_Loop1;

    public class L15 {
	public static void main(String[] args) {
		
	int num=158;
	int actnum=num;
	int r=0;
	int armnum=0;
		
	while(num>0) {
	r=num%10;
	armnum=r*r*r+armnum;
	num=num/10;
	}
	if(armnum==actnum) {
	System.out.println("Palindrome");
	}
	else {
    System.out.println("Not palindrome");
	}
	}
    }
