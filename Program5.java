package in.act.cdac;

public class Program5 {
	static int thirdMax(int arr[],int n ) {
		if(n<3) {
			System.out.println("Invalid array");
		}
		
		int first=arr[0],second =Integer.MIN_VALUE,third=Integer.MIN_VALUE;
		for(int i=0;i<n;i++) {
			if(arr[i]>first) {
			   third=second;
			   second=first;
			   first=arr[i];
			}else if(arr[i]>second) {
				third=second;
				second =first;
				
			}else if(arr[i]>third) {
				third=arr[i];
			}
		}
		return third;
		
	}
	

	public static void main(String[] args) {
		int arr[]= { 16,82,45,67 };
		 int n=arr.length;
		 System.out.println("Third max num: "+thirdMax(arr,n));
		 

}
}
