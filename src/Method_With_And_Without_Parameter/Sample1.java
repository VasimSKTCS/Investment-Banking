package Method_With_And_Without_Parameter;

public class Sample1 {//Class Is Open
	
	public static void main (String[] args) {//Main Method Class Is Open
		
		System.out.println("I Respect My Parents");
		
		Addition();
		
		Subtraction(50,25.5);
		
		System.out.println("I Miss My Uncle Shaikh Saleem");
		
	    }//Main Method Class Close
	
	    public static void Addition() {
	 	int a=10;
		long l=1100l;
		long z=a+l;
		System.out.println(z);
	    }
		public static void Subtraction(int h,double b) {
	    double f=h-b;
		System.out.println(f);
		}
				
        }//Class Is Close
