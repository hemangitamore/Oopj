package in.act.cdac;

import java.util.Scanner;

public class Program1 {
	public static void main(String[] args) {
		int arr[]=new int [4];
	    Scanner sc=new Scanner(System.in);
	    System.out.println("Enter array elements:");
	    for(int i=1;i<4;i++) {
	    	arr[i]=sc.nextInt();
	    }
	    
	    System.out.println("Print entered elements:");
	    for(int i=1;i<4;i++) {
	    	System.out.println(arr[i]);
	    }
	}

}
