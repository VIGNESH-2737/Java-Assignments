import java.util.List;
import java.util.Collections;

public class RemoteControlCompetition {

    public interface RemoteControlCar {
        void drive();
        int getDistanceTravelled();
    }

    public static class ProductionRemoteControlCar implements RemoteControlCar, Comparable<ProductionRemoteControlCar> {
        private int distanceTravelled = 0;
        private int numberOfVictories = 0;

        @Override
        public void drive() {
            distanceTravelled += 10;
        }

        @Override
        public int getDistanceTravelled() {
            return distanceTravelled;
        }

        public int getNumberOfVictories() {
            return numberOfVictories;
        }

        public void setNumberOfVictories(int victories) {
            this.numberOfVictories = victories;
        }

        @Override
        public int compareTo(ProductionRemoteControlCar other) {
            return Integer.compare(other.getNumberOfVictories(), this.numberOfVictories);
        }
    }

    public static class ExperimentalRemoteControlCar implements RemoteControlCar {
        private int distanceTravelled = 0;

        @Override
        public void drive() {
            distanceTravelled += 20;
        }

        @Override
        public int getDistanceTravelled() {
            return distanceTravelled;
        }
    }

    public static class TestTrack {
        public static void race(RemoteControlCar car) {
            car.drive();
        }

        public static List<ProductionRemoteControlCar> getRankedCars(List<ProductionRemoteControlCar> cars) {
            Collections.sort(cars);
            return cars;
        }
    }

    public static void main(String[] args) {
        ProductionRemoteControlCar prodCar1 = new ProductionRemoteControlCar();
        ProductionRemoteControlCar prodCar2 = new ProductionRemoteControlCar();
        ExperimentalRemoteControlCar expCar = new ExperimentalRemoteControlCar();

        TestTrack.race(prodCar1);
        TestTrack.race(prodCar2);
        TestTrack.race(expCar);

        prodCar1.setNumberOfVictories(3);
        prodCar2.setNumberOfVictories(5);

        System.out.println("Production Car 1 Distance: " + prodCar1.getDistanceTravelled());
        System.out.println("Production Car 2 Distance: " + prodCar2.getDistanceTravelled());
        System.out.println("Experimental Car Distance: " + expCar.getDistanceTravelled());

        List<ProductionRemoteControlCar> rankedCars = TestTrack.getRankedCars(List.of(prodCar1, prodCar2));
        System.out.println("Ranked Production Cars by Victories:");
        for (ProductionRemoteControlCar car : rankedCars) {
            System.out.println("Victories: " + car.getNumberOfVictories());
        }
    }
}
