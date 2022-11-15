package Logical_Loop2;

    import java.util.Scanner;

    public class S16 {
	public static void main(String[] args) {
		
	Scanner scan=new Scanner(System.in);
		
	System.out.println("Give String");
		
	String name=scan.next();
	System.out.println(name);
		
	String correct=name.replaceAll("[^a-zA-Z]", "");
	
	System.out.println(correct);
	
	}
    }
