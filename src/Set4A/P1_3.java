package Set4A;

public class P1_3 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 25;
        int e = 35;
        boolean f = false;
        boolean g = true;
        boolean rs;

        rs = f && f;
        System.out.println("The value of rs is = " + (rs));  //0

        rs = f && g;
        System.out.println("The value of rs is = " + (rs));  //0

        rs = g && f;
        System.out.println("The value of rs is = " + (rs));  //0

        rs = g && g;
        System.out.println("The value of rs is = " + (rs));  //1


    }
}
