package Method_With_And_Without_Parameter;

    public class Sample3 {//class is open
	public static void main(String[] args) {//main class is open
		
		System.out.println("I Want To Study Manual Testing");
		
		Sample3 X=new Sample3 ();
		
		X.Addition();
	    X.Subtraction(55,50);
	    
		Sample3 X1=new Sample3 ();
		
		System.out.println(X1);
		System.out.println(X);
		
		System.out.println("IAm Not Studing Manual Testing");
		
		
	     }//Main Method Class Is Close
	
         public void Addition() {
	     int c=49;
	     int d=40;
	     int e=c+d;
	     System.out.println(e);
         }
         
	     public void Subtraction(int a,int b) {
         int g=a-b;
         System.out.println(g);
	     }
	     
         }//Class Is Close

