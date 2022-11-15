package Logical_Loop10;

    public class S4 {
	public static void main(String[] args) {
		
	StringBuffer st=new StringBuffer("I Love Java");
	System.out.println(st.reverse());
		
	String s[]="you Shall Not Pass".split(" ");
	String ans="";
	for(int i=s.length-1;i>=0;i--) {
	ans+=s[i]+" ";
	}
	System.out.println("Reversed String:"+ans);
    }
    }