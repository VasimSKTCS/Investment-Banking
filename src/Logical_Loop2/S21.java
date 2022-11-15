package Logical_Loop2;

    import java.util.Scanner;

    public class S21 {
	public static void main(String[] args) {
	
	Scanner scan=new Scanner(System.in);
		
	int count=0;
	
	System.out.println("Le User Give The String");
	
	String name=scan.nextLine();
	
	System.out.println(name);
		
	for(int i=0;i<=name.length()-1;i++) {
	char ch=name.charAt(i);
	if(ch==' ') {
	count++;
	}
	}
	
	System.out.println(count);
	
	}			
	}
    
