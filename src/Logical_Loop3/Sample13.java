package Logical_Loop3;

    public class Sample13 {
	public static void main(String[] args) {
		
		String name="VA@iBH@#aV";//contains special char
		
		String correctname=name.replaceAll("[^a-zA-Z]","");
		System.out.println(correctname);
	}

}
