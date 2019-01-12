package com.psoft.nayon.Misc;

public class RecapEmployee {

    double salary;
    double bonus;

    RecapEmployee() {
        this.salary = 60000;
        this.bonus = 20000;
    }

    RecapEmployee(double salary, double bonus) {
        this();
        this.salary += salary;
        this.bonus += bonus;
    }

    public double getSalary() {
        return salary + bonus;
    }
}
