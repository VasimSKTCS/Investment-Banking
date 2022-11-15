package Logical_Loop9;

public class S38 {
	public static void main(String[] args) {
		
		int num=153;
		int actnum=num;
		int r=0;
		int armnum=0;
		
		while(num>0) {
			r=num%10;
			armnum=r*r*r+armnum;
			num=num/10;
		}
		if(armnum==actnum) {
			System.out.println("Armstrog Num");
		}
		else {
			System.out.println("Not Armstrong");
		}
		
		
	}

}
