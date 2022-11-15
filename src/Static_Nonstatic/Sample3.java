package Static_Nonstatic;

        public class Sample3 {//Class Is Open
    	
    	static char C='V';
    	
    	static boolean B=true;
    	
    	static byte A=5;
    	
    	short s=45;
    	
    	int i=60;
    	
    	float f=452.31f;
	
	    public static void main(String[] args) {//Method Class Is Open
		
		System.out.println("I Not Take Dinner Today");
		
		System.out.println(C);
		System.out.println(B);
		System.out.println(A);
		
		Sample3 V=new Sample3();
		
		System.out.println(V.s);
		System.out.println(V.i);
		System.out.println(V.f);
		
		System.out.println("Because Iam Not Felling Hungry Today");
		
	    }//Method Class Is Close
        }//Class Is Close
