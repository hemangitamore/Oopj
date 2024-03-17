package in.act.cdac;

import java.util.Scanner;

public class Employe {
	
	public void ShowDetails(String name,int id,int  salary) {
		System.out.println("Name of the employe: "+name);
		System.out.println("Id of employe: "+ id);
		System.out.println("Salary of employe: "+salary);
		
		
	}
	
	public void ShowDetails(String Roll) {
		System.out.println("Roll pf employe: "+Roll);
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Employe employe=new Employe();
		System.out.println("Enter Name:");
		String Name=sc.nextLine();
		System.out.println("Enter id:");
		int Id=sc.nextInt();
		System.out.println("Enter salary:");
		int salary=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter roll in company:");
		String roll=sc.nextLine();
		employe.ShowDetails(roll);
		
		
		employe.ShowDetails(Name,Id,salary);
		
		
		
		
	}
	

}
