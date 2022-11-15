package LL_For_Practice2;

    public class LL36 {
	public static void main(String[] args) {
		
	String name="BigginersBook";
	int vcount=0;
	int ccount=0;
	name=name.toLowerCase();
	for(int i=0;i<name.length();i++) {
	char ch=name.charAt(i);
	if(ch=='o'||ch=='a'||ch=='e'||ch=='i'||ch=='u'){
	vcount++;
	}
	else if(ch>='a'&&ch<='z') {
	ccount++;
	}
	else {
	continue;//it resumes the control of program to next iteration of that loop enclosing the continue
	//and made executional flow inside the loop again
	}
	}
	System.out.println(vcount);
	System.out.println(ccount);
	}
    }
