import java.util.Scanner;
public class Vowels {
	public static void main(String args[]) {
		char c;
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter the character:");
		c=scan.next().charAt(0);
		
	
	if(c == 'a' ||  c== 'e' || c=='o' || c=='u' || c =='i' ) {
		System.out.println("its a Vowels");
	}else {
		System.out.println("it's a consonants");
	}
}

}
