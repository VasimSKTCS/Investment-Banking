package Constructor_With_Paramerized;

    public class Sample10 {//BLC
	
	String gunName;//Only Declaration
	int noOfBullets;//Only Declaration
	
	public Sample10(String gunName,int noOfBullets) {
	this.gunName=gunName;
	this.noOfBullets=noOfBullets;
	}
    public void shoot() {
	for(int i=1;i<=noOfBullets;i++) {
	System.out.println("Mar Do Sale Ko");
	}
    }
    }
