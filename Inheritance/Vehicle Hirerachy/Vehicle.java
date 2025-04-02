public abstract class Vehicle {
    private String name;
    private String colour;

    public Vehicle(String name, String colour) {
        this.name = name;
        this.colour = colour;
    }

    public abstract void start();
    public abstract void drive();

    public String getName() {
        return name;
    }

    public String getColour() {
        return colour;
    }

    @Override
    public String toString() {
        return "Vehicle Name: " + name + ", Colour: " + colour;
    }
}
