package LL_For_Practice2;

    public class LL39 {
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
