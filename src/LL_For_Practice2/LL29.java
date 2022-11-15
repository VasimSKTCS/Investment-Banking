package LL_For_Practice2;

    public class LL29 {
	public static void main(String[] args) {
		
	int[]num= {1,2,3,4,5};
	System.out.println(num.length);
		
	int[] num1= {1,2,3,4,5,1,2,5};
	
	for(int i=0;i<=num1.length-1;i++){
	for(int j=i+1;j<=num1.length-1;j++) {
	if(num1[i]==num1[j]) {
	System.out.println(num1[j]);
	}
	}
	}	
	}
    }
