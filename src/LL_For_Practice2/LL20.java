package LL_For_Practice2;

    public class LL20 {
	public static void main(String[] args) {
		
	String name="V A S I M";
	int count=0;
		
	for(int i=0;i<=name.length()-1;i++) {
	char ch=name.charAt(i);
	if(ch==' ') {
	count++;
	}			
	}
	System.out.println(count);
	}
    }
