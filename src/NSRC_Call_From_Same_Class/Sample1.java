package NSRC_Call_From_Same_Class;

    public class Sample1 {//class is open
	
	public static void main (String[] args) {//main class is open
		
	System.out.println("I Love Allah");
		
	Sample1 f=new Sample1 ();
		    f.a1();
		    f.b2();
		    f.c3();
		    f.d4();
		
	System.out.println("I Love Prophet SWA");
		
	}//class is close
	
	public void a1() {
	System.out.println("I Follow The Mohammad SWA");
	}
	public void b2() {
	System.out.println("I Trust On Allah");
	}
	public void c3() {
	System.out.println("I Pray For Allah");
	}
	public void d4() {
	System.out.println("I Work Hard");
	}

    }//main class is close

