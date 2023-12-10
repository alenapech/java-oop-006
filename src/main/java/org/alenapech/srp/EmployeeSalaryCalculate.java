package org.alenapech.srp;

public class EmployeeSalaryCalculate {
    int baseSalary;

    public EmployeeSalaryCalculate(int baseSalary) {
        this.baseSalary = baseSalary;
    }

    public double calculateSalary() {
        return baseSalary * 1.5;
    }
}
