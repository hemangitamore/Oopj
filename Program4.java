package in.act.cdac;

import java.util.Scanner;

public class Program4 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		try {
			System.out.println("Enter number:");
			int num=sc.nextInt();
			if(num%2!=0) {
				throw new ArithmeticException("Number is odd");
			}
		}catch(ArithmeticException ex){
			System.out.println("Inside catch block");
			ex.printStackTrace();
			
		}finally {
			sc.close();
			System.out.println("Inside finally block");
		}
	}

}
