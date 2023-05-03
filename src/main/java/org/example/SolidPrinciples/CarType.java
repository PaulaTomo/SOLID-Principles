package org.example.SolidPrinciples;

// TODO: Open/Close:
// O clasa trebuie sa fie deschisa la extindere si inchisa la modificare pentru a evita erorile//

public class CarType extends Car{
    private String type;
    public CarType(String model, String color, int year,String type) {
        super(model, color, year);
        this.type = type;
    }
public String getTypeCar(){
        return "The car " + this.getModel() + " is the type " + type;
}

    public String getType() {
        return type;
    }
}
