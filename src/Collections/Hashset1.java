package Collections;

    import java.util.HashSet;

    public class Hashset1 {
	public static void main(String[] args) {
		
	HashSet hs=new HashSet();
	
	hs.add("DANISH");
	hs.add(100);
	hs.add(null);
	hs.add(null);
	hs.add("DANISH");
	hs.add(100);
		
	System.out.println(hs);
	System.out.println(hs.size());
	System.out.println(hs.isEmpty());
	
	hs.clear();
	System.out.println(hs);
		
    }		
    }
