package in.act.cdac;
import java.util.Scanner;

public class Vehicle {
	
	public static void printDetails(String name ,String color) {
		
		
		
		System.out.println("Name of the car: " + name);
		System.out.println("Color of the car: "+color);
		
		
	}
	
	
	public static void printDetails(float price){
		System.out.println("Prize of car: "+price+"Lakh");
		
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		Vehicle car=new Vehicle();
		//car.printDetails("Maruti ","Red ");
		//car.printDetails(34.5f);                                       
		
		System.out.println("Enter name: ");
		String name=sc.nextLine();
		System.out.println("Enter color:");
		String color=sc.nextLine();
		sc.nextLine();
		System.out.println("Enter price:");
		float price=sc.nextFloat();
		//float prize=sc.nextFloat();
		printDetails(name,color);
		printDetails(price);
		
		
		
	}

}
