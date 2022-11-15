package Static_Nonstatic;

    public class Sample2 {//Class Is Open ULC
	
	static float f=125.20f;
	
	double d=55.29;
	
	public static void main(String[] args) {//Main Method Class Is Open 
		
	System.out.println("Hello Java");
		
	System.out.println(f);
		
	Sample2 Z=new Sample2 ();
		
	System.out.println(Z.d);
		
	System.out.println("How Are U Java");
		
		
	}//Method Class Is Close
    }//Class Is Close
