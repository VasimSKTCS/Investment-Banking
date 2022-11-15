package Logical_Loop2;

    public class S19 {
	public static void main(String[] args) {
		
	int num=153;
	int orgnum=num;
	int r=0;
	int armnum=0;
		
	while(num>0) {
	r=num%10;
	armnum=r*r*r+armnum;
	num=num/10;	
	}
	
	if(armnum==orgnum) {
	System.out.println("Given Number Is Armstrong Number");
	}
	
	else {
	System.out.println("Given Number Is Not Armstrong Number");
	}
	
	}
	}
    
