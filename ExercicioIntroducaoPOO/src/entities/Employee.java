package entities;

public class Employee {
    public String name;
    public double grossSalary;
    public double tax;

    public double netSalary() {
        return this.grossSalary - this.tax;
    }

    public void increaseSalary(double percentage) {
        this.grossSalary += this.grossSalary * (percentage / 100);
    }


    public String toString() {
        return String.format("%s, $ %.2f\n", this.name, this.netSalary());
    }

}
