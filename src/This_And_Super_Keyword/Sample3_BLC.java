package This_And_Super_Keyword;

    public class Sample3_BLC extends Sample2_BLC {//BLC
	
	boolean B=true;//Global Variable From Same Class
	
	public void Practice() {
	System.out.println(this.B);//true
	System.out.println(super.A);//55
	}

    }
