package interfacedemo;
//marker interface

public interface Parking {
}

class Car1 implements Parking {
    void print() {
        System.out.println("in car");
    }
}

class Bike1 {
    void print() {
        System.out.println("in bike");
    }
}

class MarkerImpl {
    public static void main(String[] args) {
        Car car = new Car();
        Bike bike = new Bike();
        if (car instanceof Parking) {
            System.out.println("Allowed");
        } else if (bike instanceof Parking) {
            System.out.println("Not Allowed");
        }
    }
}
