package in.act.cdac;

import java.util.Scanner;

public class Program5 {
	public static void main(String[] args) {
		int arr[]=new int[3];
		Scanner sc=new Scanner(System.in);
		
			try {
				for(int i=0;i<4;i++) {
					arr[i]=sc.nextInt();
				}
			}catch(ArrayIndexOutOfBoundsException ex) {
				System.out.println("Inside catch block");
				ex.printStackTrace();
			}finally {
				sc.close();
				System.out.println("Inside finally block");
			}
		}
	}


