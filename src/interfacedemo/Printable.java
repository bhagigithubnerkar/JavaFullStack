package interfacedemo;

public interface Printable {
    void print();
}

interface Showable {
    void print();

}

class TestMultipleInterface implements Printable, Showable {

    @Override
    public void print() {
        System.out.println("printing");
    }
}

class TestmultipleInterfaceImpl {
    public static void main(String[] args) {
        TestMultipleInterface testMultipleInterface = new TestMultipleInterface();
        testMultipleInterface.print();



    }
}


 

        
    
