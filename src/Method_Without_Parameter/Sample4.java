package Method_Without_Parameter;

    public class Sample4 {//Class Is Open3
	public static void main (String[] args) {//Main Method Class Is Open
		
	System.out.println("I Have To Wake Up For Salah");
	Multiplication ();
	System.out.println("But I Cant Waked Up");
		
	}///Main Method Class Is Close 
	
	public static void Multiplication() {
	float a=12.2f;
	byte b=55;
	double c=a*b;
		
	System.out.println(c);
	
	}
    }//Class Is Close 
