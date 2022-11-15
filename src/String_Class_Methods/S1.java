package String_Class_Methods;

    public class S1 {
	public static void main(String[] args) {
		
	/*String s="VASIM";
	System.out.println(s.toCharArray().length);
	System.out.println(s.lastIndexOf(""));
	System.out.println(s);*/
	    
    printNos(1, 100);
    }
    public static void printNos(int initial, int last)
    {
    if (initial <= last) {
    System.out.print(initial + " ");
    printNos(initial + 1, last);
    }
	}
	}
    
