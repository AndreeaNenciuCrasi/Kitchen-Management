package com.company;

import java.util.concurrent.ThreadLocalRandom;

public class Helper extends Employee{
    private int carrot;
    private int potato;
    private int meat;

    public Helper(String name, String birthDate) {
        super(name, birthDate, 2000.00);
        this.carrot = ThreadLocalRandom.current().nextInt(0, 4);
        this.potato = ThreadLocalRandom.current().nextInt(0, 4);
        this.meat = ThreadLocalRandom.current().nextInt(0, 4);
    }

    public int getCarrot() {
        return carrot;
    }

    public void setCarrot(int carrot) {
        this.carrot = carrot;
    }

    public int getPotato() {
        return potato;
    }

    public void setPotato(int potato) {
        this.potato = potato;
    }

    public int getMeat() {
        return meat;
    }

    public void setMeat(int meat) {
        this.meat = meat;
    }

    @Override
    void getTaxReport() {
        double tax = getSalary()-0.99*getSalary();
        System.out.println(getName() + " says: I need to pay: " + tax + " $");
    }
}
