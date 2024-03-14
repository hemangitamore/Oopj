package in.act.cdac;

public class Widening {
	@SuppressWarnings("unused")
	public static void main(String args[]) {
		int num1=12;
		double num2=num1;
		System.out.println("integer to double:"+ num2);
		
		double n1=34.67d;
		int n2=(int)n1;
	    System.out.println("double to integer:" + n2);
	    
	    float n3=67.8f;
	    double n4= n3;
	    System.out.println("float to double:"+ n4);
		
		
	}

}
