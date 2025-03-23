package Listas.ExercicioFixacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import Listas.ExercicioFixacao.entities.Employee;

public class application {
    public static void main(String[] args) {

        List<Employee> list = new ArrayList<>();

        Scanner sc = new Scanner(System.in);
        System.out.print("How many employees will be registered? ");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {

                System.out.println("Employee #" + (i + 1) + ":");
                System.out.println("Enter the employees ID:");
                int employeeId = sc.nextInt();
                for (Employee x : list) {
                    while (employeeId == x.getId()) {
                        System.out.println("This ID is already in use. Please enter a new one:");
                        employeeId = sc.nextInt();
                    }
                }

                System.out.println("Enter the employees name:");
                String employeeName = sc.next();
                System.out.println("Enter the employees salary:");
                double employeeSalary = sc.nextDouble();

                list.add(new Employee(employeeId, employeeName, employeeSalary));
            }

        
            int employeeNumber = 1;
        for (Employee x : list) {
            System.out.println("---------------------");
            System.out.println("Employee #" + employeeNumber + ": ");
            System.out.println("Employee ID: " + x.getId());
            System.out.println("Employee name: " + x.getName());
            System.out.println("Employee salary: " + x.getSalary());
            employeeNumber++;
        }

        System.out.println("---------------------");
        System.out.println("Select the employee ID to increase salary: ");
        int idIncrease = sc.nextInt();
        System.out.println("Enter the porcentage: ");
        double percentage = sc.nextDouble();

        for (Employee x : list){
            if (x.getId().equals(idIncrease)) {
                x.increaseSalary(percentage);
                System.out.println("New salary: " + x.getSalary());
            }else {
                System.out.println("None ID selected! ");
            }
        }
        sc.close();
    }
}
