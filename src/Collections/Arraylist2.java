package Collections;

import java.util.ArrayList;

    public class Arraylist2 {
	public static void main(String[] args) {
		
	ArrayList n=new ArrayList();
		
	n.add("JAADU");
	n.add(100);
	n.add(null);
	n.add("VASIM");
	n.add(100);
	n.add(null);
		
	System.out.println(n);
		
	System.out.println(n.size());
		
	System.out.println(n.isEmpty());
		
	n.add(3,"SHAIKH");
	System.out.println(n);
		
	n.remove(3);
	System.out.println(n);
	
	}
    }
