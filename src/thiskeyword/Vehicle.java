package thiskeyword;

/**
 * 2. to invoke current class constructor
 */

public class Vehicle {
    int wheels;
    String vehicleType;

    public Vehicle(){
        this(4,"Car");
        System.out.println("in default constructor");
    }

    public Vehicle(int wheels, String vehicleType) {
        this.wheels = wheels;
        this.vehicleType = vehicleType;
        System.out.println(wheels+" "+vehicleType);
    }
}
class VehicleImpl{
    public static void main(String[] args) {
        Vehicle vehicle = new Vehicle();
    }
}
