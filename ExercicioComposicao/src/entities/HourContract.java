package entities;

import java.time.LocalDate;

public class HourContract {
    private final double valuePerHour;
    private final int hours;
    private final LocalDate date;

    public HourContract(LocalDate date, double valuePerHour, int hours) {
        this.date = date;
        this.valuePerHour = valuePerHour;
        this.hours = hours;
    }

    public double totalValue() {
        return this.hours * this.valuePerHour;
    }

    public LocalDate getDate() {
        return date;
    }
}
