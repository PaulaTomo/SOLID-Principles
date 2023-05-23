package org.example.SolidPrinciples;

// TODO:  Liskov Substitution:
// Derived or child classes must be substitutable for their base or parent classes
public class Engine extends Car {
    private final String engine;

    public Engine(String model, String color, int year, String engine) {
        super(model, color, year);
        this.engine = engine;
    }

    @Override

    public String getDetails() {
        return (this.getModel() + " Engine: " + this.engine);
    }


}
