package com.company;

public class Main {

    public static void main(String[] args) {
        Chef chef = new Chef();
        Cook cook = new Cook("Ivan", "12.05.1999");
        Helper helper1 = new Helper("Alex", "14.09.2000");
        Helper helper2 = new Helper("Adrian", "25.12.1996");
        Helper helper3 = new Helper("Andrei", "07.04.1990");
        chef.getTaxReport();
        chef.receivedKnifes();
        cook.getTaxReport();
        cook.receivedKnifes();
        helper1.getTaxReport();
        helper2.getTaxReport();
        helper3.getTaxReport();

        System.out.println();
        System.out.println();

        int k = 0;
        while (k <15) {
            chef.cook();

            switch (chef.getIngredient()) {
                case ("carrot"):
                    getIngredientFromHelper(helper1, helper2, helper3, cook,"carrot");
                    break;
                case ("potato"):
                    getIngredientFromHelper(helper1, helper2, helper3, cook,"potato");
                    break;
                case ("meat"):
                    getIngredientFromHelper(helper1, helper2, helper3, cook,"meat");
                    break;
            }
            k++;
        }
    }

    public static void getIngredientFromHelper(Helper helper1, Helper helper2, Helper helper3, Cook cook, String ingredient){
        if(helper1.getCarrot() != 0 ){
            helper1.setCarrot(helper1.getCarrot()-1);
            System.out.println(helper1.getName() + " says: Here you have " + ingredient);
            cook.cook();
        }else if(helper1.getCarrot() == 0  && helper2.getCarrot() != 0){
            helper2.setCarrot(helper2.getCarrot()-1);
            System.out.println(helper2.getName() + " says: Here you have " + ingredient);
            cook.cook();
        }else if(helper1.getCarrot() == 0  && helper2.getCarrot() == 0 && helper3.getCarrot() != 0){
            System.out.println(helper3.getName() + " says: Here you have " + ingredient);
            helper3.setCarrot(helper3.getCarrot()-1);
            cook.cook();
        }else{
            System.out.println("We’re all out");
            System.out.println(cook.getName() + " says: Thank God!!!!!! ");
        }
    }
}
