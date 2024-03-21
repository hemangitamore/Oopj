package in.act.cdac;

public class Program4 {
	
	
	
	static int getMin(int arr[],int n) {
		int result=arr[0];
		for(int i=0;i<n;i++) {
			result=Math.min(result,arr[i]);
			
		}
		return result;
		
	}
	
	static int getMax(int arr[],int n) {
		int result=arr[0];
		for(int i=0;i<arr.length;i++) {
			result=Math.max(result, arr[i]);
		}
		return result;
		
	}
	
	

	public static void main(String[] args) {
		int arr[]= {8,7,2,9};
		int n=arr.length;
		System.out.println("Min element in array: "+getMin(arr,n));
		System.out.println("Max element in array: "+getMax(arr,n));
		
		
	}

}
