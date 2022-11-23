package controlflowstatement;

public class LargestNo {
    public static void main(String[] args) {
        int x = 10;
        int y = 20;
        int z = 15;
        if (x > y && x > z)
            System.out.println("x is largest");
        else if (y > x && y > z)
            System.out.println("y is largest");
        else
            System.out.println("z is largest");
    }
}
