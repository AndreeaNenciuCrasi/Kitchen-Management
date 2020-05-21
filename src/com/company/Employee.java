package com.company;

public abstract class Employee {
    private String name;
    private String birthDate;
    private double salary;

    public Employee(String name, String birthDate, double salary) {
        this.name = name;
        this.birthDate = birthDate;
        this.salary = salary;
    }

    public String getName() {
        return name;
    }

    public String getBirthDate() {
        return birthDate;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    abstract void getTaxReport();
}
