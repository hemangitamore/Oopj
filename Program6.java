package in.act.cdac;

import java.util.Arrays;

public class Program6 {
   public static void main(String[] args) {
	int arr1[]=new int[]{23,60,94,3,102};
	int arr2[]=new int[] {42,16,74};
	int n=arr1.length +arr2.length;
	int c1[]=new int[n];
	int i=0,k=0,j=0;
	while(i<arr1.length && j<arr2.length) {
		c1[k++]=arr1[i++];
		c1[k++]=arr2[j++];
	}
	
	while(i<arr1.length) {
		c1[k++]=arr1[i++];
		
	}
	while(j<arr2.length) {
		c1[k++]=arr2[j++];
	}
	
	System.out.println("Merged array:"+Arrays.toString(c1));
	
	
	
	
	
}
}
