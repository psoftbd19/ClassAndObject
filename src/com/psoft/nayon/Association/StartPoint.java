package com.psoft.nayon.Association;

import java.util.ArrayList;

public class StartPoint {

    public static void main(String[] args) {


        Employee nahid,moin,nyon;
        nahid=new Employee();
        moin=new Employee();
        nyon=new Employee();

        nahid.setFirstName("Md. ");
        nahid.setMiddleName("Nahid ");
        nahid.setLastName("Hasan ");

        moin.setFirstName("Md. ");
        moin.setMiddleName("Moin ");
        moin.setLastName("Mollik ");

        nyon.setFirstName("Md. ");
        nyon.setMiddleName("Nayon ");
        nyon.setLastName("Sikder ");


        Address address=new Address();
        address.setHouseNo("33");
        address.setRoadNo("10A");
        address.setPostalCode("A5646");

        Company psoft=new Company();
        psoft.setName("Psoft");
        psoft.setEstDate("01-01-2008");
        psoft.setTrLicence("AB33473");
        psoft.setMobileNumber("017177348");
        psoft.setCompanyAddress(address);
        ArrayList<Employee> empList=new ArrayList<>();
        empList.add(nahid);
        empList.add(nyon);
        empList.add(moin);
        psoft.setEmployeeList(empList);

        Address address1=psoft.getCompanyAddress();
        String  roadNo=address1.getRoadNo();

        System.out.println("Roadno: "+roadNo);
        System.out.println(psoft);



    }
}
