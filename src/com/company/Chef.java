package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Chef extends Employee implements CanCook{
    private String ingredient ="";

    public Chef() {
        super("Chef", "11.11.1988", 5000.00);
    }

    public String getIngredient() {
        return ingredient;
    }

    @Override
    void getTaxReport() {
        double tax = getSalary()-0.99*getSalary();
        System.out.println(getName() + " says: I need to pay: " + tax + " $");
    }

    @Override
    public void cook() {
        List<String> ingredients = new ArrayList<>();
        ingredients.add("carrot");
        ingredients.add("potato");
        ingredients.add("meat");
        this.ingredient = ingredients.get(new Random().nextInt(ingredients.size()));
        System.out.println(getName() + " shouts: I need " + this.ingredient + " !!!");
    }

    @Override
    public void receivedKnifes() {
        System.out.println(getName() + " says: I received my knifes the day they hired me");
    }
}
