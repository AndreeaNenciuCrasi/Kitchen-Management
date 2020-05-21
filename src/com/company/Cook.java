package com.company;

public class Cook extends Employee implements CanCook{
    public Cook(String name, String birthDate) {
        super(name, birthDate, 3500.00);
    }

    @Override
    void getTaxReport() {
        double tax = getSalary()-0.99*getSalary();
        System.out.println(getName() + " says: I need to pay: " + tax + " $");
    }

    @Override
    public void cook() {
        System.out.println(getName() + " says: I dirt my hands and get the job done");
    }

    @Override
    public void receivedKnifes() {
        System.out.println(getName() + " says: I received my knifes two days after they hired me");
    }
}
