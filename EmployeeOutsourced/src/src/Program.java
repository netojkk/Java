package src;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutsourcedEmployee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		List<Employee> list = new ArrayList<>();
		
		System.out.print("Enter the number of employees: ");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Employee #" + (i+1) + " data:");
			System.out.print("Outsorced (y/n): ");
			char outsourced = sc.next().charAt(0);
			
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
					
			System.out.print("Hours: ");
			int hours = sc.nextInt();
					
			System.out.print("Value per hour: ");
			double valueHours = sc.nextDouble();
		
			if (outsourced == 'y') {
				System.out.print("Additional Charge: ");
				double additional = sc.nextDouble();
				
				Employee employee = new OutsourcedEmployee(name, hours, valueHours, additional);
				System.out.println("New Outsourced Employee!");
				list.add(employee);
			} 
			else if (outsourced == 'n') {
				
				Employee employee = new Employee(name, hours, valueHours);
				System.out.println("New Employee!");
				list.add(employee);
			}	
			else {
				System.out.println("ERROR!! Incorrect answer in 'outsourced'! REPEAT");
			}
		} // for
		
		System.out.println();
		System.out.println("PAYMENTS:");
		for(Employee emp : list) {
			System.out.println(emp.getName() + " - $" + String.format("%.2f",emp.payment()));
		}
		
		
		sc.close();
		
	} //main args
}; // class Program
	


