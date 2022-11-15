package Maps;

import java.util.Hashtable;

    public class Hashtable2 {
	public static void main(String[] args) {
		
	Hashtable<Integer, String> y=new Hashtable<Integer,String>();
		
	y.put(100, "VASIM");
	y.put(200, "SHAIKH");
	y.put(300, "SHAMIM");
	y.put(400, "Zikra");
	y.put(500, "Shaikh");
    y.put(600, "Vasim");
		
	System.out.println(y);//print all
	
	y.remove(300);
	
	System.out.println(y);
	
	}
    }
