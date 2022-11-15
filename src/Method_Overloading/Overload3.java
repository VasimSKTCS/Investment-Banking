package Method_Overloading;

    public class Overload3 {
	public static void main(String[] args) {
		
	Overload3 o=new Overload3();
	o.addition(20, 30);
	o.addition(10, 20, 30);
	}
    public void addition(int a,int b) {
	System.out.println(a+b);
    }
    public void addition(int a,int b,int c) {
	System.out.println(a+b+c);
    }
    }
