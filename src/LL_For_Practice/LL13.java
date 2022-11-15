package LL_For_Practice;

    public class LL13 {
	public static void main(String[] args) {
   
	printnum(1, 100); 		
    
	}
	public static void printnum(int start,int end) {
	if(start<=end) {
	System.out.println(start);
	start++;
	printnum(start, end);
	}
	}

    }
