package Nested_Loop3;

    public class N13 {
	public static void main(String[] args) {
		
	int star=1;
	int space=3;
	for(int i=1;i<=7;i++) {
	for(int j=1;j<=space;j++) {
	System.out.print(" ");
	}
	for(int k=1;k<=star;k++) {
	System.out.print("*");
	}
	System.out.println();
	if(i<=3) {
	star++;
	space--;
	}
	else {
	star--;
	space++;
	}
	}
	}
    }
