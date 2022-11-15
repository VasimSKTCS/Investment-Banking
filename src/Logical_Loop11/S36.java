package Logical_Loop11;

    public class S36 {
	public static void main(String[] args) {
		
	int[] num=new int[] {1,2,3,1,3,4};
	int count=0;
		
	for(int i=0;i<num.length;i++) {
	for(int j=i+1;j<num.length;j++) {
	if(num[i]==num[j]) {
	System.out.println(num[i]);
	count++;
	}
	}
	}		
	}
    }
