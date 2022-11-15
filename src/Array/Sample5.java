package Array;

    public class Sample5 {
	public static void main(String[] args) {
		
	String ar[]=new String[6];
	
	ar[0]="VASIM";
	ar[1]="SHAIKH";
	ar[2]="ALFIYA";
	ar[3]="SHAIKH";
	ar[4]="ZIKRA";
	ar[5]="SHAIKH";
	
	System.out.println(ar[4]);
	
	for(int i=0;i<=5;i++) {
	System.out.println(ar[i]);
	}
	
	try {
	System.out.println(ar[6]);
	}
	
	catch(ArrayIndexOutOfBoundsException Donky) {
	System.out.println("Idiot ur r trying to fetch data which is not avai");
	}
	
	}
    }
