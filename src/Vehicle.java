abstract class Vehicle {
    public abstract void travel();

    Vehicle() {
        System.out.println("Creating " + getClass().getName());
//        System.out.print(getClass().getName() + " travels by ");
//        travel();
    }
}
