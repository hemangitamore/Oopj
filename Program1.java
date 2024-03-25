package in.act.cdac;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Inside try block");
			System.out.println("Num1: ");
			int num1=sc.nextInt();
			System.out.println("Num2: ");
			int num2=sc.nextInt();
			
			if(num2==0) {
				throw new ArithmeticException("Divided by zero");
				
				
			}
			
			int result = num1 /num2;
			System.out.println(result);
			
		}catch(ArithmeticException ex) {
			System.out.println("Inside catch block");
			ex.printStackTrace();
		}finally {
			sc.close();
			System.out.println("Inside finally block");
		}
	}

}
