package com.psoft.nayon.Misc;

public class Method {

    double salary;
    double bonus;

    double getSalary(double salary,double bonus) {
        double totalSalary = this.salary + this.bonus;
       // System.out.println("Total String: " + totalSalary);
        return totalSalary;
    }

}
