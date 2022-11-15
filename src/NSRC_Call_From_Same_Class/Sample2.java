package NSRC_Call_From_Same_Class;

public class Sample2 {//class is open
public static void main (String[] args) {//main method class is open
		System.out.println("I Done Zuhar Namaz");
		
		Sample2 g=new Sample2 ();
		g.A1();
		g.B2();
		g.C3();
		g.D4();
		g.E5();
		g.F5();
		
		System.out.println("The Zuhar Nanaz Time Is In Afternoon");
		
		
	}//main method class is close
	
	public void A1() {
	System.out.println("I  Pray Five Times in a Day");
	}
	public void B2() {
	System.out.println("The First Namaz Is Fajar");
	}
	public void C3() {
	System.out.println("The Second Namaz Is Zuhar");
	}
	public void D4() {
	System.out.println("The Third Namaz Iz Asar");
	}
	public void E5() {
	System.out.println("The Forth Namaz Is Magrib");
	}
	public void F5() {
	System.out.println("The Fifth Namaz Is Isha");
	}

    }//class is close
