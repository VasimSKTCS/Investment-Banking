package Exception_Class;

    public class Exception_Handlling {
	public static void main(String[] args) {
		
	int a=1;
	int b=0;
	
    try {   	
	int c=a/b;
	System.out.println(c);
	}
    
	catch(ArithmeticException monky) {
	System.out.println("Idiot Put The Valid Data");
	}
    
	}
    }
