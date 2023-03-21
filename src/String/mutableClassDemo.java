package String;

final class Customer {
    private final String name;

    public Customer(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}

public class mutableClassDemo {
    public static void main(String[] args) {
        Customer customer = new Customer("Varun");
        System.out.println(customer.getName());

    }
}

