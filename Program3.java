package in.act.cdac;

import java.util.Scanner;

public class Program3 {
	public static void main(String[] args) {
		int arr1[]=new int[3];
		/*int arr1[]=new int[] {2,3,4};
		for(int i=arr1.length-1;i>=0;i--) {
			System.out.println(arr1[i]);
		}*/
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array elements:");
		for(int i=0;i<arr1.length;i++) {
			arr1[i]=sc.nextInt();
		}
		
		System.out.println("Entered array:\n");
		for(int i=0;i<arr1.length;i++) {
			System.out.print(arr1[i]+" ");
		}
		
		System.out.println("\nReverse array:");
		for(int i=arr1.length-1;i>=0;i--) {
			System.out.print(arr1[i]+" ");
		}

	}
}
