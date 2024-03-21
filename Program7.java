package in.act.cdac;

import java.util.Arrays;
import java.util.Scanner;

public class Program7 {
   public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	int arr[]=new int[5];
	System.out.println("Enter array elements:");
	for(int i=0;i<arr.length;i++) {
		arr[i]=sc.nextInt();
	}
	
	System.out.println("Entered allements:");
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i]);
	}
	
	System.out.println("Average of the 1st three elements:");
	int sum=0;
	for(int i=1;i<=3;i++) {
		sum=sum+arr[i];
		
	}
	int averag=sum/3;
	System.out.println(averag);
	
	
	
	
	
}
}
