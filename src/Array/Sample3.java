package Array;

    public class Sample3 {
    public static void main(String[] args) {
	
	String ar[]=new String[3];
	
	ar[0]="SHAIKH DANISH";
	ar[1]="SHAIKH VASIM";
	ar[2]="SHAIKH ZIKRA";
	//ar[3]="SHAIKH ALFIYA";
	//ar[4]="SHAIKH JULEKHA";
	//ar[5]="SHAIKH SHAMIM";
	System.out.println(ar[1]);
	System.out.println(ar[0]);
	//System.out.println(ar[3]);
	
	try {
	System.out.println(ar[3]);
	}
	
	catch(ArrayIndexOutOfBoundsException b) {
	System.out.println("Idiot No Such data available which ur are try to fatch");
	}
	
	for(int i=0;i<=ar.length-1;i++) {
	System.out.println(ar[i]);
	}
	
    }
    }
