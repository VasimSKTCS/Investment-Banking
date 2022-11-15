package Global_Variable1;

     public class Static_Nonstatic_Variable {//class is open
	 static int i=25;
	        byte b=5;
	        short s=200;
	        long l=258741369l;
	        double d=294.44;
	        float f=12.25f;
	        char ch='b';
	        boolean z=true;
	        String k="Alfiya";
	
	 public static void main (String[] args) {//main method class is open
	    	
	 System.out.println(i);
		
	 Static_Nonstatic_Variable s=new Static_Nonstatic_Variable ();
		
	 System.out.println(s.f);
	 System.out.println(s.b);
	 System.out.println(s.s);
	 System.out.println(s.l);
	 System.out.println(s.d);
	 System.out.println(s.ch);
     System.out.println(s.z);
     System.out.println(s.k);
		
	 } //main method class is close
     }//class is close
