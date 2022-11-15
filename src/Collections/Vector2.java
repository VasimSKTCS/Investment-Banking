package Collections;

import java.util.Vector;

public class Vector2 {
	public static void main(String[] args) {
		
		Vector v=new Vector();
		v.add("SHAMIM");
		v.add(100);
		v.add(null);
		v.add(100);
		v.add("SHAIKH");
		v.add(null);
		
		System.out.println(v);
		System.out.println(v.size());
		System.out.println(v.isEmpty());
		
		v.add(4,"VASIM");//right shift operation
		System.out.println(v);
		
		v.remove(2);//left side shift
		System.out.println(v);
		
	}

}
