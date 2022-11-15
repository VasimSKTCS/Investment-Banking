package Logical_Loop1;

    public class L23 {
	public static void main(String[] args) {
		
	/*int num[]= {1,2,3,4};
	System.out.println(num.length);*/
		
	int[] num=new int[] {1,2,3,3,4,5,4};
		
	for(int i=0;i<num.length;i++) {
	for(int j=i+1;j<num.length;j++) {
				
	if(num[i]==num[j]) {
	System.out.println(num[i]);
	}			
	}
	}
	}
    }
