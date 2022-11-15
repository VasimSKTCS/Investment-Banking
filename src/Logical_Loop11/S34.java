package Logical_Loop11;

    public class S34 {
	public static void main(String[] args) {
		
	String name="i love my mom and dad";
	String ss="";
	String ar[]=null;
	ar=name.split(" ");
	for(int i=0;i<ar.length;i++) {
	String s=ar[i].substring(0, 1).toUpperCase()+ar[i].substring(1);
	ss=ss+" "+s;
	}
	System.out.println(ss);
	}
    }
