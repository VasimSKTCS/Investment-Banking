package Logical_Loop6;

    public class S22 {
	public static void main(String[] args) {
		
	int num=5;
	int count=0;
		
	for(int i=1;i<=num;i++) {
	if(num%i==0) {
	count++;
	}
	}
    if(count==2) {
	System.out.println("Given Number Is Prime Number");
	}
	else {
	System.out.println("Given Number Is Not Prime Number");
    }
	
	}
    }
