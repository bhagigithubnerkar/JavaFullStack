package multithreading;

public class ThreadDemo1 extends Thread {

    public void run() {        //running
        System.out.println("in run method");
    }

}

class ThreadDemoImpl1 {
    public static void main(String[] args) {
        ThreadDemo1 th1 = new ThreadDemo1();  //born/new
        System.out.println("in main method");
        th1.start();    //runnable
    }
}
