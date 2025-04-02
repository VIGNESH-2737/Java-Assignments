public class Car extends Vehicle {
    private int seatingCapacity;
    private int numDoors;

    public Car(String name, String colour, int seatingCapacity, int numDoors) {
        super(name, colour);
        this.seatingCapacity = seatingCapacity;
        this.numDoors = numDoors;
    }

    @Override
    public void start() {
        System.out.println(getName() + " is starting with a roar!");
    }

    @Override
    public void drive() {
        System.out.println(getName() + " is being driven smoothly.");
    }

    @Override
    public String toString() {
        return super.toString() + ", Seating Capacity: " + seatingCapacity + ", Number of Doors: " + numDoors;
    }
}
