package com.psoft.nayon.Misc;

public class Main {

    public static void main(String[] args) {
        // write your code here
        // Object Create
       /* Employee moin, nahid;
        moin = new Employee();//Object Initialize
        nahid = new Employee(31231, 3823);

        moin.getSalary();
        nahid.getSalary();*/

      /*  Method add;
        add=new Method();

        add.salary=10000;
        add.bonus=4000;

        double ownSalary=add.getSalary(4000,2000);
        System.out.println(ownSalary);*/

        Encapsulation nayon;
        nayon = new Encapsulation();
        nayon.setSalary(100000);
        nayon.bonus = 20000;
        nayon.getTotalSalary();
        double someOneSalary = nayon.getSalary();
        System.out.println(someOneSalary);


    }
}
