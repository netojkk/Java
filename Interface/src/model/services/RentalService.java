package model.services;

public class RentalService {

    private Double pricePerHour;
    private Double pricePerDay;

    private BrasilTaxService taxService;

    public RentalService(Double pricePerHour, Double pricePerDay, BrasilTaxService taxService) {
        this.pricePerHour = pricePerHour;
        this.pricePerDay = pricePerDay;
        this.taxService = taxService;
    }
}
