package Collections;

    import java.util.Vector;

    public class Vector1 {
	public static void main(String[] args) {
	
	Vector v=new Vector();
	
	v.add("PASS");
	v.add('S');
	v.add('T');
	v.add(100);
	v.add(100);
	v.add(100);
	v.add(null);
	v.add("ABBA");
	v.add("Retired");
	v.add(null);
	v.add("AMMI");
	v.add("Ghumne");
	v.add(1000);
	
	//print all data in class
	System.out.println(v);
	
	//to check the size 
	System.out.println(v.size());
	
	//to check whether it is empty or not
	System.out.println(v.isEmpty());
	
	//add operation
	v.add(10,"BADE ABBA");
	System.out.println(v);
	
	//DLEETE OPERATION
	v.remove(10);
	System.out.println(v);
		
	}
    }
