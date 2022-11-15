package LL_For_Practice;

    public class LL2 {
	public static void main(String[] args) {
		
	String name="i am from vaijapur";
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
