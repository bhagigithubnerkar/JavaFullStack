package java8;

public interface Shape {

    void calculate();
}


class SquareImpl {
    public static void main(String[] args) {
        Shape shape = () -> {
            System.out.println(6 * 6);
        };
        shape.calculate();
    }
}

