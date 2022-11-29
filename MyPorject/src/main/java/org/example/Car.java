package org.example;

public abstract class Car {

    public String manufacturer;
    public String model;
    public Double maxSpeed;
    public Integer productionYear;

    public Car(String manufacturer, String model, Double maxSpeed, Integer productionYear) {
        this.manufacturer = manufacturer;
        this.model = model;
        this.maxSpeed = maxSpeed;
        this.productionYear = productionYear;
    }
    public abstract void drive();
}
