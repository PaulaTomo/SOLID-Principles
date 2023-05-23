package org.example.SolidPrinciples;

// TODO: Open/Close:
//Objects or entities should be open for extension but closed for modification.//

public class CarType extends Car {
    private String type;

    public CarType(String model, String color, int year, String type) {
        super(model, color, year);
        this.type = type;
    }

    public String getTypeCar() {
        return "The car " + this.getModel() + " is the type " + type;
    }

    public String getType() {
        return type;
    }
}
