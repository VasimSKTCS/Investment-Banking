package Collections;

    import java.util.LinkedHashSet;

    public class Linkedhashset1 {
	public static void main(String[] args) {
		
	LinkedHashSet lh=new LinkedHashSet();
		
	lh.add("VASIM");
	lh.add(100);
	lh.add(null);
	lh.add(100);
	lh.add("VASIM");
	lh.add(100);
		
	System.out.println(lh);
	System.out.println(lh.size());
	System.out.println(lh.isEmpty());
	lh.clear();
	System.out.println(lh);
	}
    }
