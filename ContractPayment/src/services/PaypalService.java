package services;

public class PaypalService  implements OnlinePaymentService{

    public double paymentFee(Double amount){
        Double fee = 0.02;
        return amount * fee;
    }

    public double interest(Double amount, Integer months){
        double tax = 0.01;
        for (int i = 0; i < months;i++) {
            tax += 0.01;
        }
        return amount * tax;
    }



}
