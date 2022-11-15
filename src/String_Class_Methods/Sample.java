package String_Class_Methods;

    public class Sample {
	public static void main(String[] args) {
		
		String s1="VASIMSHAIKH";
		String s2="vasimshaikh";
		String s3="vasim";
		String s4="velocity";
		String s5="VASIMshaikh";
		String s6="shaikh";
		
		//1 length() it counts the characters
		System.out.println(s1.length());
		System.out.println(s2.length());
		System.out.println(s3.length());
		System.out.println(s4.length());
		
		//2 toUppercase() it converts the lowercase alphabets to uppercase
		System.out.println(s3.toUpperCase());
		System.out.println(s4.toUpperCase());
		System.out.println(s5.toUpperCase());
		
		//3 toLowercase() it converts the uppercase alphabets to lowercase
		System.out.println(s1.toLowerCase());
		System.out.println(s5.toLowerCase());
		
		//4 equals() it checks equality of two strings
		System.out.println(s1.equals(s5));
		System.out.println(s2.equals(s4));
		System.out.println(s3.equals(s3));
		
		//5 equalsIgnorecase() it compare 2 strings
		System.out.println(s1.equalsIgnoreCase(s5));
		System.out.println(s4.equalsIgnoreCase(s4));
		
		//6 charAt() It will give char of particular index
		System.out.println(s1.charAt(4));
		System.out.println(s1.charAt(0));
		
		//7 indexof() it will give index of particular char
		System.out.println(s1.indexOf('V'));
		System.out.println(s3.indexOf('m'));
		
		//8 contains() it will check weather it contains or not
		System.out.println(s1.contains(s3));
		System.out.println(s2.contains(s3));
		
		//9 lastIndexof() it will give index of particular char
		System.out.println(s2.lastIndexOf('s'));
		System.out.println(s1.lastIndexOf('I'));
		
		//10 startwith() it will check string start with that char or not
		System.out.println(s1.startsWith("VA"));
		System.out.println(s2.startsWith("va"));
		
		//11 endswith() it will check string ends with or not
		System.out.println(s5.endsWith("kh"));
		System.out.println(s4.endsWith("ty"));
		
		//12 substring() if we want to break string
		System.out.println(s1.substring(4));
		System.out.println(s2.substring(5));
		
		//13 concat() if we want to join string
		System.out.println(s3.concat(s6));
		System.out.println(s3.concat(s4));
		
		//14 replace() if we want to replace the string
		System.out.println(s1.replace("VASIM", "danish"));
		System.out.println(s4.replace("city","GAON"));
		
	}

}
