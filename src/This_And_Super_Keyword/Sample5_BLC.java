package This_And_Super_Keyword;

    public class Sample5_BLC extends Sample6_BLC {//BLC
	
	char C='F';//Global Variable From Same Class
	
	public void Jamoon() {
	System.out.println(super.S);//L Lag Gaye
	System.out.println(this.C);//F
	}

    }
