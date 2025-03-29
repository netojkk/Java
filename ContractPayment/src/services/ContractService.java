package services;

import entities.Contract;
import entities.Installment;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ContractService {

    private OnlinePaymentService ops;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");


    public void processContract(Contract contract, Integer months){

        double installment = contract.getTotalValue() / months;
        for (int i = 0 ; i < months; i++){
            double interest = ops.interest(installment, months);
            installment += interest;

            double fee = ops.paymentFee(installment);
            installment += fee;

            Installment im = new Installment(contract.getDate(), installment);

        }
    }

}
