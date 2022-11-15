package LL_For_Practice2;

    public class LL7 {
	public static void main(String[] args) {
		
	/*StringBuffer b=new StringBuffer("vasim");
	System.out.println(b.reverse());*/
		
	String name="mother";
	String rev="";
	
	for(int i=name.length()-1;i>=0;i--) {
	rev=rev+name.charAt(i);
	}
	System.out.println(rev);
			
	}
    }
