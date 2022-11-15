package Logical_Loop1;

    public class L26 {
	public static void main(String[] args) {
		
	printnum(1, 10);
		
	//System.out.println(start);
			
	}//main method body closed

	public static void printnum(int start,int end) {
		
	if( start <= end) {
			
	System.out.println(start);	
	start++;
	printnum(start, end);
	}	
	}	
    }//class body closed
