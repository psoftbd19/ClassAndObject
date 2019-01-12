package com.psoft.nayon.Misc;
// Class Name (Employee)
public class Employee {

    double salary;
    double bonus;

    // Constructor
    /*
    1.constructor have no return type including void type
    2.set default value
    3.constructor call when object create
     */
    Employee() {
        this.bonus = 5000;
        System.out.println("Constructor fired");
    }

    Employee(double salary, double bonus) {
        this.salary=salary;
        this.bonus=bonus;
    }
    void getSalary() {
        double totalSalary = salary + bonus;
        System.out.println("Total String: " + totalSalary);
    }

}
