package LL_For_Practice;

    public class LL8 {
	public static void main(String[] args) {
		
	//int num[]= {1,2,3,4,5};	
	//System.out.println(num.length);
	
	int[] num=new int[] {1,2,1,3,4,2};
		
	for(int i=0;i<num.length;i++) {
	for(int j=i+1;j<num.length;j++) {
	if(num[i]==num[j]) {
	System.out.println(num[i]);
	}
	}
	}
	}
    }
