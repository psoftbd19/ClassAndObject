package com.psoft.nayon.Misc;

public class RecapEncap {
    private double salary;
    double bonus;

    public double getBonus() {
        return bonus;
    }

    public void setBonus(double bonus) {

        this.bonus = bonus;
    }

    public double getTotalSalary() {
        return salary + bonus;
    }

   public void setSalary(double salary) {
        if(salary>=20000&&salary<=200000) {
            this.salary = salary;
        }else{
            System.out.println("Check salary!");
        }
    }

    public double getSalary(){
        return salary;
    }
}
