package org.example;

import org.example.SolidPrinciples.Car;
import org.example.SolidPrinciples.CarType;
import org.example.SolidPrinciples.Engine;

public class Main {

    public static void main(String[] args) {

        Car firstCar = new Car("Audi", "Grey", 2008);
        System.out.println(firstCar.getDetails());
        System.out.println(firstCar.startEngine());
        System.out.println(firstCar.accelerate(60));
        System.out.println(firstCar.stopEngine());

        CarType carType = new CarType("BMW", "red", 2015, "sport");
        System.out.println(carType.getTypeCar());
        System.out.println(carType.checkEngine());

        Engine carEngine = new Engine("Ford", "White", 2020, "Electric");
        System.out.println(carEngine.getDetails());
        System.out.println(carEngine.changeOil());
    }
}