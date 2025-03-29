package src;

import entities.Contract;
import services.ContractService;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        System.out.println("Enter contract data: ");
        System.out.println("Number: ");
        int number = sc.nextInt();

        System.out.println("Date (dd/mm/yyyy): ");
        String dateInput = sc.next();
        LocalDate date = LocalDate.parse(dateInput, formatter);

        System.out.println("Contract Value: ");
        double totalValue = sc.nextDouble();

        System.out.println("Enter the number of installments");
        int months = sc.nextInt();

        Contract contract = new Contract(number, date, totalValue);
        ContractService service = new ContractService();
        service.processContract(contract, months);

    }
}