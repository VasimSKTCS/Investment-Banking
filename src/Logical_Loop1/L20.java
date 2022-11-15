package Logical_Loop1;

    public class L20 {
	public static void main(String[] args) {
		
	String name="hi dear where are u";
	String s="";
	String ar[]=null;
	ar=name.split(" ");
		
	for(int i=0;i<ar.length;i++) {
	String ss=ar[i].substring(0, 1).toUpperCase()+ar[i].substring(1);
	s=s+" "+ss;
	}
	System.out.println(s);
	}
    }
