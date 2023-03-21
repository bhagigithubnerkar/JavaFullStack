package java8;

/**
 * Reference to a constructor
 */

interface Test {
    void dispaly(String msg);
}

public class MRConstructor {
    public MRConstructor(String msg) {
        System.out.println(msg);
    }
}

class MRConstructorImpl {
    public static void main(String[] args) {
        Test test = MRConstructor::new;
        test.dispaly("HII");
    }
}
