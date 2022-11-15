package Logical_Loop4;

public class Sample18 {
	public static void main(String[] args) {
		
		int num=8;
		int count=0;
		
		for(int i=1;i<=num;i++) {
			if(num%i==0) {
				count++;
			}
		}
			if(count==2) {
				System.out.println("Given No Is Prime");
			}
			else {
				System.out.println("Given no Is Not Prime");
			}
		}
	}


