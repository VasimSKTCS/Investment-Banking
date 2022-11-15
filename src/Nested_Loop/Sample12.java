package Nested_Loop;

    public class Sample12 {//
	public static void main(String[] args) {
		
	int star=7;
	int space=0;
		
	for(int i=1;i<=4;i++) {
		
	for(int k=1;k<=space;k++) {
	System.out.print(" ");
	}
	
	for(int j=1;j<=star;j++) {
	System.out.print("*");
	}
	
    System.out.println();
	star=star-2;
	space++;
	}
	
	}//Main Method Body Closed
    }//Class Body Is Closed
