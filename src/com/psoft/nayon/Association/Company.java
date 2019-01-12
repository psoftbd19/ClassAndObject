package com.psoft.nayon.Association;


import java.util.ArrayList;

public class Company {
    private String name;
    private String estDate;
    private String trLicence;
    private String mobileNumber;
    private Address companyAddress;
    private ArrayList<Employee> employeeList = new ArrayList<>();

    public ArrayList<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(ArrayList<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public Address getCompanyAddress() {
        return companyAddress;
    }

    public void setCompanyAddress(Address companyAddress) {
        this.companyAddress = companyAddress;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEstDate() {
        return estDate;
    }

    public void setEstDate(String estDate) {
        this.estDate = estDate;
    }

    public String getTrLicence() {
        return trLicence;
    }

    public void setTrLicence(String trLicence) {
        this.trLicence = trLicence;
    }

    public String getMobileNumber() {
        return mobileNumber;
    }

    public void setMobileNumber(String mobileNumber) {
        this.mobileNumber = mobileNumber;
    }

    @Override
    public String toString() {
        return "Company{" +
                "name='" + name + '\'' +
                ",\n estDate='" + estDate + '\'' +
                ",\n trLicence='" + trLicence + '\'' +
                ",\n mobileNumber='" + mobileNumber + '\'' +
                ",\n companyAddress=" + companyAddress +
                ",\n employeeList=" + employeeList +
                '}';
    }
}
