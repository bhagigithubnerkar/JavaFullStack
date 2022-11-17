package polymorphism;

public class Bike {
    void run(){
        System.out.println("Bike run method");
    }
}

class Pulsar extends Bike{
    @Override
    void run() {
        System.out.println("Pulsar run method");
    }
}

class BikeImpl{
    public static void main(String[] args) {
        Bike bike = new Pulsar();  // upcasting
        bike.run();
    }
}
