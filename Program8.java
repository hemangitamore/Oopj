package in.act.cdac;


import java.util.Scanner;

public class Program8 {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter array length:");
		int n=sc.nextInt();
		int arr[]=new int[n];
		System.out.println("Enter elements:");
		for(int i=0;i<n;i++) {
			arr[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<n;i++) {
			if(arr[i]%2==0) {
				arr[i]=arr[i]*arr[i];
			}else {
				arr[i]=arr[i]*arr[i]*arr[i];
			}
		}
		for(int i:arr) {
			System.out.println(i);
		}
		
		
		
		
	}

}
