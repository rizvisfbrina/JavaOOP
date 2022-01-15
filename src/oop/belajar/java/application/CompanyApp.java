package oop.belajar.java.application;

import oop.belajar.java.data.Company;

public class CompanyApp {
    public static void main(String[] args) {
        Company company = new Company();
        company.setName("Apple");

        Company.Employee employee = company.new Employee();
        employee.setName("sulastri");

        System.out.println(employee.getName());
        System.out.println(employee.getCompany());
    }
}
