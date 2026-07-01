import java.util.Scanner;

class Vehicle {

    public String startEngine() {
        return "Vehicle engine started";
    }
}

class Car extends Vehicle {

    @Override
    public String startEngine() {
        return "Car engine roars";
    }
}

class Motorcycle extends Vehicle {

    @Override
    public String startEngine() {
        return "Motorcycle engine revs";
    }
}

public class VehicleDispatch {

    public static void main(String[] args) {

        Vehicle[] vehicles = new Vehicle[2];

        vehicles[0] = new Car();
        vehicles[1] = new Motorcycle();

        for (Vehicle v : vehicles) {
            System.out.println(v.startEngine());
        }
    }
}