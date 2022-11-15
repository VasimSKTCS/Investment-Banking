package Logical_Loop5;

public class S20 {
	public static void main(String[] args) {
		//finding armstrong number
		
		int num=153;
		int act=num;
		int armnum=0;
		int k=0;
		
		
		while(num>0) {
			k=num%10;//it used for to extract the numbers
			armnum=k*k*k+armnum;
			num=num/10;
			
		}
	}

}
