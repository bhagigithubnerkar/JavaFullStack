package Set4A;

public class P1_4 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 25;
        int e = 25;
        boolean f = false;
        boolean g = true;
        boolean rs;

        rs = f || f;
        System.out.println("The value of rs is = " + (rs));

        rs = f || g;
        System.out.println("The value of rs is = " + (rs));

        rs = g || f;
        System.out.println("The value of rs is = " + (rs));

        rs = g || g;
        System.out.println("The value of rs is = " + (rs));
    }
}
