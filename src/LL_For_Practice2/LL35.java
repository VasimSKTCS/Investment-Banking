package LL_For_Practice2;

import java.util.HashMap;

    public class LL35 {
	public static void main(String[] args) {
		
	String name="ZikraShaikh";
		
	HashMap<Character, Integer> charcount=new HashMap<Character, Integer>();
	for(int i=0;i<name.length();i++) {
	if(charcount.containsKey(name.charAt(i))) {
	int count=charcount.get(name.charAt(i));
	charcount.put(name.charAt(i), ++count);
	}
	else {
	charcount.put(name.charAt(i), 1);
	}
    }
	System.out.println(charcount);
	}
    }
