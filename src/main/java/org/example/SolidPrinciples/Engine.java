package org.example.SolidPrinciples;

// TODO:  Liskov Substitution:
/* Principiul Liskov Substitution este legat de modul în care clasele sunt utilizate
 într-un program și se referă la capacitatea de a înlocui un obiect al unei clase
cu un obiect al unei clase derivate fără a afecta corectitudinea programului.
Acest principiu este important pentru proiectarea unui sistem modular și coerent,
 deoarece permite utilizarea polimorfismului într-un mod sigur și eficient.*/

public class  Engine  extends Car{
    private final String engine;
    public Engine(String model, String color, int year,String engine) {
        super(model, color, year);
        this.engine = engine;
    }
    @Override

    public String getDetails(){
        return (this.getModel() + " Engine: " + this.engine );
    }


}
