package in.act.cdac;
import java.util.Scanner;

public class Student {
	
	String name;
	int RollNo;
	String SurName;
	
	public void acceptRecord() {
		try(Scanner sc=new Scanner(System.in)){
			System.out.println("Enter Name:");
			this.name=sc.nextLine();
			System.out.println("Enter RollNo:");
			this.RollNo=sc.nextInt();
			sc.nextLine();
			System.out.println("Enter SurName:");
			this.SurName=sc.nextLine();
			
			
			
			
			
		}
	}
	
	public void printRecord() {
		System.out.println(this.name +" "+ this.RollNo+ " "+ this.SurName+" ");
		
	}
	
	
	public static void main(String[] args) {
		Student student=new Student();
		student.acceptRecord();
		student.printRecord();
		
	}
	

}
