package org.example;

public class BMW extends Car {


    public BMW(String manufacturer, String model, Double maxSpeed, Integer productionYear) {
        super(manufacturer, model, maxSpeed, productionYear);
    }

    @Override
    public void drive() {
        System.out.println("BMW is driving");
    }
}
