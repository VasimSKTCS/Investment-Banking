package Logical_Loop10;

import java.util.Hashtable;

    public class S1 {
	public static void main(String[] args) {
		
	Hashtable<Integer, String>t=new Hashtable<Integer, String>();
		
	t.put(101, "VASIM");
	t.put(102, "SHAIKH");
    t.put(103, "SHAMIM");
	t.put(104, "ZIKRA");
	t.put(105, "SHAIKH");
	t.put(106, "VASIM");
		
	System.out.println(t);
	System.out.println(t.remove(101));
	t.remove(101);		
	}
    }
