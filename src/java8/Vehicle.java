package java8;

public interface Vehicle {
    String getBrand();

    String speedUp();

    String slowDown();


    default void turnAlarmOn() {
        System.out.println("Alarm is ON");
    }

    default void turnAlarmOff() {
        System.out.println("Alarm is OFF");
    }

    default void getSpeed() {

        System.out.println("Speed is low");
    }

    static void calculateSpeed() {
        int speed = 0;

        if (speed < 40)

            System.out.println("Average Speed");

        else
            System.out.println("High Speed");

    }

    class Car implements Vehicle {

        @Override

        public String getBrand() {

            return null;
        }

        @Override
        public String speedUp() {

            return null;
        }

        @Override
        public String slowDown() {

            return null;
        }


    }

    class CarImpl {
        public static void main(String[] args) {
            Vehicle vehicle = new Car();
            vehicle.getSpeed();
            vehicle.turnAlarmOn();
            vehicle.turnAlarmOff();


        }


    }
}

