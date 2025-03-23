package EnumComposicao.src;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import EnumComposicao.entities.Department;
import EnumComposicao.entities.HourContract;
import EnumComposicao.entities.NewWorker;

public class Program {
    public static void main(String[] args) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter department's name:");
        String departmentName = sc.nextLine();

        System.out.println("Enter worker data:");

        System.out.println("Enter Name:");
        String workerName = sc.nextLine();

        System.out.println("Enter Worker Level:");
        String workerLevel = sc.nextLine();

        System.out.println("Base salary:");
        double baseSalary = sc.nextDouble();

        NewWorker worker = new NewWorker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Department(departmentName)); 

        System.out.println("How many contracts to this worker?");
        int n = sc.nextInt();

        for (int i = 0; i < n; i++){
            System.out.println("Enter contract #" + i + " data:");
            System.out.println("Date (DD/MM/YYYY)");
            Date contractDate = sdf.parse(sc.next());
            System.out.println("Value per hour:");
            double valuePerHour = sc.nextDouble();
            System.out.println("Duration (hours):");
            int hours = sc.nextInt();
            	
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }

        System.out.println();
        System.out.println("Enter the month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        int month = Integer.parseInt(monthAndYear.substring(0, 2));
        int year = Integer.parseInt(monthAndYear.substring(3));

        System.out.println("Name: " + worker.getName());
        System.out.println("Department: " + worker.getDepartment().getName());
        
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker.income(year, month)));

        sc.close();
    }
}
