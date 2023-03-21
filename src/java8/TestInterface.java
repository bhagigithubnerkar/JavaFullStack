package java8;


interface I1 {
    default void display() {
        System.out.println("In display method");
    }

}

interface I2 {
    default void display() {
        System.out.println("in display method ");
    }

}

public class TestInterface implements I1, I2 {
    public static void main(String[] args) {
        TestInterface testInterface = new TestInterface();
        testInterface.display();
    }

    @Override
    public void display() {
        I1.super.display();
    }
};





