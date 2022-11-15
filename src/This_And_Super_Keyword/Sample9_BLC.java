package This_And_Super_Keyword;

    public class Sample9_BLC extends Sample8_BLC{//User Logic Class
	
	short S=355;//Global Variable From Same Class
			
	public void M11() {
	System.out.println(this.S);//355
	System.out.println(super.b);//false
	}
		
	}
    
