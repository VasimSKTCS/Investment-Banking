package Method_With_And_Without_Parameter;

    public class Sample2 {//Class Is Open
	public static void main(String[] args) {//Main Method Class Is Open
		
	System.out.println("I Have 5 Mock Member");		
		
	Multiplication(50,50.50f);
		
	Dividation();
	
	System.out.println("They Intrested In Morning Mock");
		
	}//Main Method Class Is Close
	
	public static void Multiplication(int s,float f) {
	System.out.println(s*f);
	}
	
	public static void Dividation() {
	int j=75;
	double d=25.5;
	double v=j/d;
    System.out.println(v);
	}

    }//Class Is Close
