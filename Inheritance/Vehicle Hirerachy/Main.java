public class Main {
    public static void main(String[] args) {
        Vehicle car = new Car("Swift", "Red", "Petrol", 180, 7, 4);
        Vehicle bike = new Bike("Max100", "Blue", "Petrol", 100);
        Vehicle truck = new Truck("Volvo FH", "White", "Diesel", 120, 10);

        System.out.println(car);
        System.out.println(bike);
        System.out.println(truck);

        car.drive();
        bike.start();
        truck.drive();
    }
}
