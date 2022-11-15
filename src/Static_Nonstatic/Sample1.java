package Static_Nonstatic;

    public class Sample1 {//class is open
    	
	static int i=55;//=55
	int j=99;//=99
	
	public static void main (String[] args) {//main method body open
		
	System.out.println(i);
		
	Sample1 s=new Sample1();
		
	System.out.println(s.j);
		
	}//main method body close
    }//class body is close
