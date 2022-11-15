package Logical_Loop6;

    public class S25 {
	public static void main(String[] args) {
		
	int num=183;
	int actnum=num;
	int r=0;
	int armnum=0;
		
	while(num>0) {
	r=num%10;
	armnum=r*r*r+armnum;
	num=num/10;
	}
	
	if(actnum==armnum) {
	System.out.println("Given Number Is Armstrong Number");
	}
			
	else {
	System.out.println("Given Number Is Not Armstrong Number");
	}
	
	}
    }
