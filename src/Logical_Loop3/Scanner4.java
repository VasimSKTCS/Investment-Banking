package Logical_Loop3;

    import java.util.Scanner;

    public class Scanner4 {
	public static void main(String[] args) {
		
	//Finding Even And Odd Numbers
		
	Scanner scan=new Scanner(System.in);
	System.out.println("Ley User Take 1 Number");
		
	int num=scan.nextInt();
	System.out.println(num);
	
	if(num%2==0) {
	System.out.println("Given Number Is Even");
	}
	
	else {
	System.out.println("Given number Is Odd");
	}
	
	}
    }
