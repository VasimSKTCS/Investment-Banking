package Logical_Loop1;

import java.util.HashMap;

    public class L28 {
	public static void main(String[] args) {
		
	String str="google";
		
	HashMap<Character, Integer> charcount=new HashMap<Character, Integer>();
	for(int i=0;i<str.length();i++) {
	if(charcount.containsKey(str.charAt(i))) {
	int count=charcount.get(str.charAt(i));
	charcount.put(str.charAt(i), ++count);
	}
	else {
	charcount.put(str.charAt(i), 1);
	}
	}
	System.out.println(charcount);
	}
    }
