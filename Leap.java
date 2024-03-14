
import java.util.Scanner;
public class Leap {
	public static void main(String args[]) {
		int year;
		Scanner scan =new Scanner(System.in);
		System.out.println("Enter a year:");
		year = scan.nextInt();
		
		
		 
		switch(year %400) {
		  case 0:
			  System.out.println("Year is leap");
		      break;
		    default:
			  switch(year %4) {
			  case 0:
				  switch(year %100) {
				  case 0:
					  System.out.println("Year is not a leap");
					  break;
					  default:
						  System.out.println("Year is leap year");
						  break;
					  }
				  break;
				  default:
					  System.out.println("Year is not leap");
					  break;
			  }
		}
	}
	

}
