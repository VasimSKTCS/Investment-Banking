package Global_Variable1;

         public class Reinitilization_And_GlobalV {//class is open
        	 
	     static byte b;//=0
	     static short s;//=0
		 static int i;//=0
	     static long l;//=0
	     static double d;//=0.0
	     static float f;//=0.0
	     static char ch;//=empty bbox
	     static boolean z;//=flase
	     static String m;//null

	     public static void main (String[] args) {//method class is open
	    	 
		 int donky=10;//=10
		     donky=30;//=30
		     donky=50;//=50
		     donky=70;//=70
		     donky=90;//=90
		     donky=125;//=125
		 
		 System.out.println(b);
		 System.out.println(s);
		 System.out.println(i);
		 System.out.println(l);
		 System.out.println(d);
		 System.out.println(f);
		 System.out.println(ch);
		 System.out.println(z);
		 System.out.println(m);
		 System.out.println(donky);
		 
	     }//main class is close
         }//class is close
