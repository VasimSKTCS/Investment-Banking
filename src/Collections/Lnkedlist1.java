package Collections;

    import java.util.LinkedList;

    public class Lnkedlist1 {
	public static void main(String[] args) {
		
	LinkedList ll=new LinkedList();
		
	ll.add("VELOCITY");
	ll.add(100);
	ll.add(null);
	ll.add("TRAINER");
	ll.add(100);
	ll.add(null);
	
	System.out.println(ll);
	System.out.println(ll.size());
	System.out.println(ll.isEmpty());
	ll.add(0,"TUETION");
	System.out.println(ll);
	ll.remove(6);
	System.out.println(ll);
	
	
		
	}
    }
