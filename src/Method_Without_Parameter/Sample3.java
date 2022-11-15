package Method_Without_Parameter;

    public class Sample3 {//Class Is Open
    	
	public static void main (String [] args) {//Main Method Class Is Open 
		
	System.out.println("Today I Meet My Old Friend");
		
	Dividation();
		
	System.out.println("My Old Friend Name Is Amol Nikam");
	
	}//Main Method Class Is Close
	
	public static void Dividation() {
	double d=60;
	double k=3;
	double v=d/k;
		
	System.out.println(v);
	
	}
    }//Class Is Close
