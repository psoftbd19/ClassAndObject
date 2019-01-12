package com.psoft.nayon.Misc;

public class Recap {

    public static void main(String[] args) {



        RecapEmployee  nayon=new RecapEmployee(40000,10000);

        double totalSalary=nayon.getSalary();
        System.out.println(totalSalary);


        RecapEncap nahid=new RecapEncap();
        nahid.setSalary(120000);
        nahid.bonus=5000;
        double fullSalary=nahid.getTotalSalary();
        System.out.println(fullSalary);
        System.out.println(nahid.getSalary());

        RecapMethod moin=new RecapMethod();
        moin.salary=25000;
        moin.bonus=15000;

        System.out.println( moin.getTotalSalary(10000,20000));
    }




}
