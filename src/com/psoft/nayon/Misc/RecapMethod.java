package com.psoft.nayon.Misc;

public class RecapMethod {

    double salary;
    double bonus;


    public double getTotalSalary(double salary, double bonus) {
        this.salary += salary;
        this.bonus += bonus;

        double sum = this.salary + this.bonus;
        return sum;
    }
}
