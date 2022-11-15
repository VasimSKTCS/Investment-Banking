package Array;

    public class Sample1 {
	public static void main(String[] args) {
		
	String ar[]=new String[5];
	ar[0]="DANISH";
	ar[1]="VASIM";
	ar[2]="SHAMIM";
	ar[3]="SHAIKH";
	ar[4]="ALFIYA";
		
	System.out.println(ar[0]);
	System.out.println(ar[3]);
	
	try {
	System.out.println(ar[5]);
	}
	
	catch(ArrayIndexOutOfBoundsException A) {
	System.out.println("Idiot give valid data");
	}
	
	for(int i=0;i<=4;i++) {
	System.out.println(ar[i]);
	}
	
	}
    }
