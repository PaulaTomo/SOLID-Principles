package org.example.SolidPrinciples;

// TODO: Single Responsibility Principle
/* The Single Responsibility Principle states that
a class should do one thing and therefore it should
have only a single reason to change. */


public class Car extends FunctionCar {
    private final String model;
    private String color;
    private final int year;


    public Car(String model, String color, int year) {
        this.model = model;
        this.color = color;
        this.year = year;

    }

    public String getDetails() {
        return (this.model + " " + this.color + " " + this.year);
    }

    public String getModel() {
        return model;
    }


    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getYear() {
        return year;
    }


}











