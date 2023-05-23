package org.example.SolidPrinciples;

// TODO: Interfaces Segregation:
/*Segregation means keeping things separated,
 and the Interface Segregation Principle is about
 separating the interfaces.
*/
public interface Maintenance {
    public boolean changeOil();

    public boolean checkEngine();
}
