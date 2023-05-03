package org.example.SolidPrinciples;

// TODO: Single Responsibility Principle
/* acest principiu afirmă că o clasă ar trebui să aibă o singură responsabilitate astfel incat vom avea
mai putine cazuri de testare, dependente mai putine si clase mai mici, bine organizate fiind mai usor de cautat */


public class Car extends FunctionCar {
   private final String model;
   private String color;
   private final int year;


   public Car(String model, String color, int year) {
      this.model = model;
      this.color = color;
      this.year = year;

   }

   public  String getDetails(){
      return (this.model +" " + this.color +" " + this.year);
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
