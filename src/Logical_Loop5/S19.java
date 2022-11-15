package Logical_Loop5;

public class S19 {
public static void main(String[] args) {
	
	//finding number between 1 to 20 prime or not
	//int num1=1;
	int num=20;
	int count=0;
	int k;
	for(int i=1;i<=num;i++) {
		for(int j=1;j<=i;j++) {
			k=i%j;
			if(k==0) {
				count++;
			}
			if(count==2) {
				System.out.println(i);
			}
		}
	}
	
	}
}

