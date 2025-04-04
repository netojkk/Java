package entities;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;

public class Installment {
    private LocalDate dueDate;
    private Double amount;

    DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    public Installment() {
    }

    public Installment(LocalDate dueDate, Double amount) {
        this.dueDate = dueDate;
        this.amount = amount;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Double getAmount() {
        return amount;
    }

    public void setAmount(Double amount) {
        this.amount = amount;
    }
}
