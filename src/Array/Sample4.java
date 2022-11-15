package Array;

    public class Sample4 {
	public static void main(String[] args) {
		
	int ar[]=new int[3];
		
	ar[0]=10;
	ar[1]=100;
	ar[2]=1000;
	//ar[3]=10000;
	//ar[4]=100000;
		
	System.out.println(ar[2]);
	
	for(int i=0;i<=ar.length-1;i++) {	
	System.out.println(ar[i]);
	}
	
	try {
	System.out.println(ar[4]);
	}
	
	catch(ArrayIndexOutOfBoundsException a) {
	System.out.println("idiot wrong data ur going to fatch");
	}
	
	}
    }
