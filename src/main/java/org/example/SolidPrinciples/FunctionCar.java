package org.example.SolidPrinciples;

// TODO: Dependency Inversion:
/*se referă la relația dintre modulele software. Acest principiu afirmă că modulele de nivel
superior nu ar trebui să depindă de modulele de nivel inferior, iar ambele ar trebui să depindă de abstracțiuni.
*/
public abstract class FunctionCar implements Drive, Maintenance{
    private boolean engineStarted;
    @Override
    public boolean startEngine() {
        this.engineStarted = true;
        System.out.println("Engine started");
        return true;
    }

    @Override
    public boolean accelerate(int speed) {
        if (speed > 50){
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
