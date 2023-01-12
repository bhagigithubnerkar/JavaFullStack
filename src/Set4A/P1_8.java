package Set4A;

public class P1_8 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 25;
        boolean e = false;
        boolean f = false;
        boolean g = true;
        boolean rs;

        rs = f && g || e;
        System.out.println("The value of rs = " + (rs));   //0

        rs = f && (!g || e);
        System.out.println("The value of rs = " + (rs));   //0

        rs = f || g && e;
        System.out.println("The value of rs = " + (rs));   //0

        rs = (f || g) && e;
        System.out.println("The value of rs = " + (rs));   //0

    }
}
