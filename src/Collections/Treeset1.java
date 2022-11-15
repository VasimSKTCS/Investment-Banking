package Collections;

    import java.util.TreeSet;

    public class Treeset1 {
	public static void main(String[] args) {
		
	TreeSet ts=new TreeSet();
	
	ts.add(800);
	ts.add(400);
	ts.add(700);
	ts.add(400);
	ts.add(100);
	ts.add(600);
	ts.add(300);
	ts.add(900);
	ts.add(500);
	ts.add(200);
	
	System.out.println(ts);
	System.out.println(ts.size());
	System.out.println(ts.isEmpty());
	//ts.clear();
	//System.out.println(ts);
	ts.pollFirst();
	System.out.println(ts);
	ts.pollLast();
	System.out.println(ts);
	
		
	}
    }
