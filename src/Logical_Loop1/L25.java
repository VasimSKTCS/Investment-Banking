package Logical_Loop1;

    public class L25 {
	public static void main(String[] args) {
	
	String name="BigginersBook";
	int vc=0;
    int cc=0;
		 
	name=name.toLowerCase();
		 
    for(int i=0;i<=name.length()-1;i++) {
	char ch=name.charAt(i);
	if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
    vc++;
	}
    else {
    cc++;
	}			 
	}
	System.out.println(vc);
	System.out.println(cc);
	}
    }
