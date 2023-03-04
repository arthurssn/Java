package entities;

import entities.enums.WorkerLevel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Worker {
    private final String name;
    private final WorkerLevel level;
    private double baseSalary;
    private Department department;
    private List<HourContract> hourContractList;

    public Worker(String name, WorkerLevel level, double baseSalary, Department department) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.department = department;
        this.hourContractList = new ArrayList<>();
    }

    public String getName() {
        return name;
    }

    public Department getDepartment() {
        return department;
    }

    public void addContract(HourContract contract) {
        this.hourContractList.add(contract);
    }

    public void removeContract(HourContract contract) {
        this.hourContractList.remove(contract);
    }

    public List<HourContract> getHourContractList() {
        return hourContractList;
    }

    public double income(int year, int month) {

        List<HourContract> hourContracts = this.hourContractList
                .stream()
                .filter(
                        contract -> contract.getDate().getMonthValue() == month &&
                                contract.getDate().getYear() == year
                )
                .collect(Collectors.toList());

        double valueTotalContracts = 0;
        for (HourContract hourContract : hourContracts
        ) {
            valueTotalContracts += hourContract.totalValue();
        }

        return baseSalary + valueTotalContracts;
    }
}
