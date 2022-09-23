package program;

public class P1_11 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=3;
        int d=2;
        int rs;
        rs = (a*(b+c*(d+a))) / (a-(b+(c/d)));
        System.out.println("The value of rs="+(rs));
    }
}
// (10*(20+3*(2+10))) / (10-(20+(3/2)))
// (10*(20+3*(12))) / (10-(20+(1)))
//(10*(20+36))) / (10-21)
// (10*(56))) / (-11)
// 560/-11 = -50
