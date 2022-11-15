package Logical_Loop3;

public class Sample15 {
public static void main(String[] args) {
	
	int num=3;//FIND THIS NO EVEN OR ODD
	int count=0;
	
	for(int i=1;i<=num;i++) {
		if (num%i==0) {
			count++;
		}
	}
	if(count==2) {
		System.out.println("Number Is Prime");
	}
	else {
		System.out.println("Number Is Odd");
	}
	}
}

