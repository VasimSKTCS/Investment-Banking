package Constructor_With_Paramerized;

    public class Sample12 {//BLC
	
	String gunName;
	int noofBullets;
	
	public Sample12(String gunName,int noofBullets) {
	this.gunName=gunName;
	this.noofBullets=noofBullets;
	}
	
	public void Shoot() {		
	for(int i=1;i<=noofBullets;i++) {			
	System.out.println("Shoot Shoot");
	}	
	}

    }
