package Set4A;

public class P1_12 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 25;
        int e = 25;
        int f = 0;
        int g = 1;
        boolean rs;

        rs = (a > b) || (c <= d) || (d == e);
        System.out.println("The value of rs = " + (rs));  //1

        rs = (a < b) && (c > d) && (d == e);
        System.out.println("The value of rs = " + (rs));  //1

        rs = !(a < b) && !(c > d) && !(d == e);
        System.out.println("The value of rs = " + (rs));  //0

        rs = !(a < b) || !(c > d) || !(d == e);
        System.out.println("The value of rs = " + (rs));  //0

        rs = (a == b) || (b == c) || (c == d) || (d == e);
        System.out.println("The value of rs = " + (rs));  //1

        rs = (a == b) && (b == c) && (c == d) && (d == e);
        System.out.println("The value of rs = " + (rs));  //0

    }
}
