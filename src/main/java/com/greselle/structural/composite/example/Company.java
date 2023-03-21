package com.greselle.structural.composite.example;

// client
public class Company {
    public static void main(String[] args) {

        Employee dev1 = new Developer("Ana", 1, "jr");
        Employee dev2 = new Developer("Carlos", 2, "s2");

        Directory engDir =  new Directory();
        engDir.addEmployee(dev1);
        engDir.addEmployee(dev2);

        Employee man1 = new Manager("Ian", 3, "s1");
        Employee man2 = new Manager("Mary", 4, "s3");

        Directory accDir =  new Directory();
        accDir.addEmployee(man1);
        accDir.addEmployee(man2);

        // the Directory (composite) will treat all the employee
        Directory companyDir = new Directory();
        companyDir.addEmployee(engDir);
        companyDir.addEmployee(accDir);
        companyDir.showEmployeeDetails();
    }
}
