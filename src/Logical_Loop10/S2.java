package Logical_Loop10;

    public class S2 {
	public static void main(String[] args) {
		
	int[] a=new int[] {1,2,3,4,5,4};
	//System.out.println(a.length);
	System.out.println("Duplicate Elements in given String");
	
	for(int i=0;i<a.length;i++) {
		
	for(int j=i+1;j<a.length;j++) {
		
	if(a[i]==a[j]) {
	System.out.println(a[i]);
	}
	}
	}	
	}
    }
