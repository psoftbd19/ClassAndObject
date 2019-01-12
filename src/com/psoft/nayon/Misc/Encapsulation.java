package com.psoft.nayon.Misc;

public class Encapsulation {

    private double salary;
    double bonus;


    void setSalary(double salary) {
        if (salary >= 20000 && salary <= 200000) {
            this.salary = salary;
        } else {
            System.out.println("Check your salary!");
        }
    }

    void getTotalSalary() {
        double totalSalary = salary + bonus;
        System.out.println("Total String: " + totalSalary);
    }

    double getSalary() {
        return salary;
    }

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {
        
        this.bonus = bonus;
    }
}
