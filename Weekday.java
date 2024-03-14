import java.util.Scanner;
public class Weekday {
	public static void main(String args[]) {
		int num;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter no for day:");
		num=scan.nextInt();
		switch(num) {
		case 1:
			System.out.println("It's a Monday");
			break;
			
		case 2:
			System.out.println("It's a Tuesday");
			break;
			
		case 3:
			System.out.println("It's a Wednesday");
			break;
			
		case 4:
			System.out.println("It's a Thursday");
			break;
			
		case 5:
			System.out.println("It's a Friday");
			break;
			
		case 6:
			System.out.println("It's a Saturday");
			break;
			
		case 7:
			System.out.println("It's a Sunday");
			break;
		}
	}

}
