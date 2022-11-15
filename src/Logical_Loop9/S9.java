package Logical_Loop9;

    public class S9 {
	public static void main(String[] args) {
		
	int num=987654321;
	int rev=0;
	
	for(int i=num;i>0;i=i/10) {
	int nuv=i%10;
	rev=rev*10+nuv;
	}
	System.out.println(rev);
	}
    }
