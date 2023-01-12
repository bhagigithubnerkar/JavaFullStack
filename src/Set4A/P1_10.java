package Set4A;

public class P1_10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 25;
        int e = 25;
        int f = 0;
        int g = 1;
        boolean rs;
        rs = !(a > b);                            //1
        System.out.println("a is less than b=" + (rs));
        rs = !(a >= b);
        System.out.println("a is grater than or equal to b or not =" + (rs)); //1
        rs = !(a < b);
        System.out.println("a is greater than b =" + (rs)); //0
    }
}
