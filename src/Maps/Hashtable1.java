package Maps;

import java.util.Hashtable;

    public class Hashtable1 {
	public static void main(String[] args) {
			
	Hashtable<Integer, String> t=new Hashtable<Integer,String>();
	
	t.put(101,"Anand");
	t.put(102,"Bablu");
	t.put(103,"Chanda");
	t.put(104,"Dhanush");
	
	System.out.println(t);//To Print All
    
	t.remove(102);
	System.out.println(t);

    }
    }