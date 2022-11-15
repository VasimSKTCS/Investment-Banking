package Method_Overloading;

    public class OverLoading3 {//User Logic Class
	public static void main (String[] args) {//Main Method Body Is Open
		
	OverLoading3 O=new OverLoading3();
		
	Addition(35, 20);
	O.Addition(100, 11500,125.25f);
	O.Addition("Vasim", 25, 35);
		
	}//Main Method Body Is Close
	
	private static void Addition(int a,int b) {
	System.out.println(a+b);
	}
	
	private void Addition (int a,double b,float c) {
	System.out.println(a+b+c);
	}
	
	private void Addition (String S,int b,int a) {
	System.out.println(S+b+a);
	}

    }//Class Body Is Close
