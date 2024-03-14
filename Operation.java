
import java.util.Scanner;
public class Operation {
	public static void main(String arg[]) {
		int n1,n2;
		char op;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter 1st num:");
		n1=scan.nextInt();
		System.out.println("Enter 2nd num:");
		n2=scan.nextInt();
		op=scan.next().charAt(0);
		switch(op) {
		case '+':
			System.out.println("sum of two given numbers:"+ (n1 + n2));
			break;
		case '-':
			System.out.println("Substraction of two given numbers:"+ (n1-n2));
			break;
			
		case '*':
			System.out.println("multiplication of two given numbers:"+ (n1 * n2));
			break;
		case '/':
			System.out.println("division of the two given numbers:"+ (n1 / n2));
			break;
			
			default:
				System.out.println("INVALID");
		}
		
		
	}

}
