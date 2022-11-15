package String_Class_Methods;

    public class CharAT {
	public static void main(String[] args) {
		
	String S1="julekha";
	String S2="JULEKHA";
		
	System.out.println(S1.charAt(4));
	try {
	System.out.println(S2.charAt(7));
	}
	catch(StringIndexOutOfBoundsException y) {
	System.out.println("Idiot put valid data");
	}
	
	}
    }
