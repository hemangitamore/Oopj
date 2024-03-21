package in.act.cdac;

public class Program2 {
	public static void main(String[] args) {
		int arr1[]=new int[] {1,2,3};
		int arr2[]=new int[] {1,2};
		boolean isEqual=true;
		if(arr1.length != arr2.length) {
			isEqual=false;
		}else {
			for(int i=0;i<arr1.length;i++) {
				if(arr1[i] != arr2[i]) {
					isEqual=false;
					break;
				}
			}
		}
		
		if(isEqual==true) {
			System.out.println("Arrays are equal");
		}else {
			System.out.println("Arrays not equals");
		}
		
	}
}
