package Logical_Loop9;

    public class S2 {
	public static void main(String[] args) {
		
	int num=112;
	int rev=0;
	for(int i=num;i>0;i=i/10) {
	int rem=i%10;
	rev=rev*10+rem;
	}
	System.out.println(rev);
	if(num==rev) {
	System.out.println("Palindrome");
	}
	else {
	System.out.println("Not Palindrome");
	}
	}
    }
