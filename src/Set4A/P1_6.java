package Set4A;

public class P1_6 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 25;
        int e = 25;
        boolean f = false;
        boolean g = true;
        boolean rs;

        rs = f && !g;
        System.out.println("The value of rs = " + (rs));  //0

        rs = f || !g;
        System.out.println("The value of rs = " + (rs));  //0

        rs = !f && g;
        System.out.println("The value of rs = " + (rs));  //1

        rs = !f || g;
        System.out.println("The value of rs = " + (rs));  //1
    }
}
