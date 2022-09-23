package program;

public class P1_10 {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;
        int c = 3;
        int d = 2;
        int rs;
        rs = ((a+b)*(c-d)) / (a*(b+(c-d)*b));
        System.out.println("The value of rs="+(rs));

    }
}
// (30)/(10*(20+(1)*20))
// (30)/(10*(20+20))
// (30)/(10*40)
//30/400 =0

