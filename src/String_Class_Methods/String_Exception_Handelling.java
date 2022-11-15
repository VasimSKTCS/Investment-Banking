package String_Class_Methods;

    public class String_Exception_Handelling {
	public static void main(String[] args) {
		
	String a="VASIM";
		
	try {//resky code into this
	System.out.println(a.charAt(5));
	}
			
	catch(StringIndexOutOfBoundsException donky) {//exception type
	System.out.println("Idiot Access The Corretct Data");
	System.out.println("There is no data which ur r try to fetch");
	}
	
		
	}
    }
