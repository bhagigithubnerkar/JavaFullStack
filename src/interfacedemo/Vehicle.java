package interfacedemo;

public interface Vehicle {
    void run();
}

class Car {
    void drive() {
        System.out.println("in drive method");
    }


}

class Bike implements Vehicle {

    @Override
    public void run() {
        System.out.println("Running");

    }
}

class Bicycle implements Vehicle{

    @Override
    public void run() {

        System.out.println("in run method");
    }
}
class BikeImpl{
    public static void main(String[] args) {
        Vehicle vehicle = new Bike();
        Vehicle vehicle1 = new Bicycle();
        vehicle.run();
        vehicle1.run();
    }
}







