package Array;

    public class Sample6 {
	public static void main(String[] args) {
		
	String ar[]=new String[6];
	
	ar[0]="Vasim";
	ar[1]="Shaikh";
	ar[2]="Shamim";
	ar[3]="Zikra";
	ar[4]="Shaikh";
	ar[5]="Vasim";
	
	System.out.println(ar[0]); 
	System.out.println(ar[1]);
	
	for(int i=0;i<=ar.length-1;i++) {
	System.out.println(ar[i]);
	}
	
	}
    }
