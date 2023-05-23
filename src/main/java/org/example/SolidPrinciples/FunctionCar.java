package org.example.SolidPrinciples;

// TODO: Dependency Inversion:
/*The Dependency Inversion principle states that our classes
  should depend upon interfaces or abstract classes instead of
  concrete classes and functions.
*/
public abstract class FunctionCar implements Drive, Maintenance {
    private boolean engineStarted;

    @Override
    public boolean startEngine() {
        this.engineStarted = true;
        System.out.println("Engine started");
        return true;
    }

    @Override
    public boolean accelerate(int speed) {
        if (speed > 50) {
            System.out.println("Accelerating");
        }
        return true;
    }

    @Override
    public boolean stopEngine() {
        this.engineStarted = false;
        System.out.println("Engine stopped");
        return true;
    }

    @Override
    public boolean changeOil() {
        System.out.println("Oil changed.");

        return false;
    }

    @Override
    public boolean checkEngine() {
        System.out.println("Engine checked.");

        return true;
    }
}
