package Collections;

    import java.util.ArrayList;

    public class Arraylist1 {
	public static void main(String[] args) {
		
	ArrayList al=new ArrayList();
		
	al.add(100);
	al.add("DANISH");
	al.add('V');
	al.add(null);
	al.add("DANISH");
	al.add(null);
	al.add(100);
	al.add("DANISH");
		
	//print all data in a class
	System.out.println(al);
		
	//get the size of data
	System.out.println(al.size());
		
	//check whether it is empty
	System.out.println(al.isEmpty());
	
	//insertion operation
	al.add(3,500);
	System.out.println(al);
	
	System.out.println(al.size());
	
	//delete operation
	al.remove(3);
	System.out.println(al);
		
	}
    }
