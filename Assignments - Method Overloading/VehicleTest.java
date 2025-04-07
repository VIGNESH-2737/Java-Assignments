
class Vehicle {
    String brand;

    Vehicle(String brand) {
        this.brand = brand;
    }

    public void start() {
        System.out.println("Vehicle is starting...");
    }

    public void stop() {
        System.out.println("Vehicle is stopping...");
    }
}


class Car extends Vehicle {

    Car(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " Car is starting with a key.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " Car is stopping with ABS.");
    }
}


class Bike extends Vehicle {

    Bike(String brand) {
        super(brand);
    }

    @Override
    public void start() {
        System.out.println(brand + " Bike is starting with a kick.");
    }

    @Override
    public void stop() {
        System.out.println(brand + " Bike is stopping using disc brakes.");
    }
}


public class VehicleTest {
    public static void main(String[] args) {
        Vehicle v1 = new Car("Toyota");
        Vehicle v2 = new Bike("Yamaha");

        v1.start(); // runtime polymorphism
        v1.stop();

        v2.start();
        v2.stop();
    }
}
