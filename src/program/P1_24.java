package program;

public class P1_24 {
    public static void main(String[] args) {
        int a=10;
        int b=20;
        int c=3;
        int d=2;
        int rs;
        rs = (a*b*c+b*c*a+c*a*b)/3;
        System.out.println("The value of rs="+(rs));
    }
}
// (10*20*3+20*3*10+3*10*20)/3
// ( 600+600+600)/3
// 600
