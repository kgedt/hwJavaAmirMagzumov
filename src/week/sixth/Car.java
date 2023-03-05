package week.sixth;

public class Car {
    private boolean engine = true;
    private int cylinders;
    private String name;
    private int wheels = 4;

    public Car(int cylinders, String name) {
        this.cylinders = cylinders;
        this.name = name;
    }

    public int getCylinders() {
        return cylinders;
    }

    public String getName() {
        return name;
    }

    public void startEngine() {
        System.out.println(this.getClass().getSimpleName() + " is starting...");
    }

    public void accelerate() {
        System.out.println(this.getClass().getSimpleName() + " is accelerating...");
    }

    public void brake() {
        System.out.println(this.getClass().getSimpleName() + " is braking...");
    }
}
