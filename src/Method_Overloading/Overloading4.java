package Method_Overloading;

    public class Overloading4 {//ULC
	public static void main (String[] args) {
	
		Subtraction(25,20);
		
		Overloading4 H=new Overloading4();
		H.Subtraction(100, 100, 'c');
		H.Subtraction('d', 2220, 125.25f, 100);
		
	
	}
	public static void Subtraction(int a,int b) {//1 Number
	System.out.println(a-b);
	}
	
	public void Subtraction(int a,int b,char c) {//2 Number
	System.out.println(a-b-'c');
	}
	
	public void Subtraction(char d,int e,float k,int f) {//3 Number
	System.out.println('d'-e-k-f);
	}
	
    }
