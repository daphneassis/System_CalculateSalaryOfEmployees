package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Employee;
import entities.OutsorcedEmployee;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of employees:");
		int n= sc.nextInt();
		List<Employee> list= new ArrayList<>();
		
		for(int i=0;i<n;i++) {
			System.out.printf("Employee #%d data:\n", i+1);
			System.out.print("Name:");
			String name= sc.next();
			System.out.print("Hours:");
			Integer hours= sc.nextInt();
			System.out.print("Value per hour:");
			Double valuePerHour= sc.nextDouble();	
			System.out.println("Outsourced (y/n)?");
			char isOutsourced = sc.next().charAt(0);
			if (isOutsourced=='y') {
				System.out.println("Additional charge:");
				Double addCharge =sc.nextDouble();
				OutsorcedEmployee emp= new OutsorcedEmployee(name, hours, valuePerHour, addCharge);
				list.add(emp);
			} else {
				Employee emp = new Employee(name, hours, valuePerHour);
				list.add(emp);
			}
			
		}
		
		
		System.out.println("PAYMENTS:");
		for (Employee emp: list) {
			System.out.println(emp);
		}
	}

}
