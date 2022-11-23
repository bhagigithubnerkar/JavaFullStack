package Common;

public class Operators{
   public static void main(String args[]){
       // Unary Operator;
       int a = 15;
       System.out.println(a++);  //15
       System.out.println(++a);  //17
       System.out.println(a--);  //17
       System.out.println(--a);  //15

       System.out.println(a++ + ++a);  //15 + 17 = 32
       int b = 10;
       int c = -10;
       System.out.println(-b); //(-b)= -10
       System.out.println(-c); //(-c)=10

       boolean isFlag = false;
       System.out.println(isFlag);
       //Arithmetic OPerator
       b = 20;
       a = 10;
       System.out.println(a + b); //30
       System.out.println(b - a); //10
       System.out.println(b * a); //200
       System.out.println(b / a); //2
       System.out.println(b % 3); //2

       //Shift Operator
       System.out.println(a << 2);  // 10*2^2 = 40
       System.out.println(a << 4); // 10*2^4 = 160
       System.out.println(b >> 2); // 20/2^2 = 5
       System.out.println(b >> 3); // 20/2^3 = 2

       float f = b >> 3;
       System.out.println(f);

       // Relational Operators
       System.out.println(20 < 30);
       System.out.println(10 > 12);
       System.out.println(10 >= 10);
       System.out.println(10 <= 10);
       System.out.println(b == a);
       System.out.println(b != a);

       if (b > a)
           System.out.println("b is greater");
       else
           System.out.println("a is greater");

       // Ternary Operator
       System.out.println(b > a ? "b is greater" : "a is greater");
       boolean greater = b > a;
       System.out.println(greater ? "b is greater" : "a is greater");

       b = 50;
       a = 30;
       System.out.println(b == a & b > a);
       System.out.println(b != a | b > a);


       // Assignment Operator
       int x = 10;
       int y = 20;
       x += y;  // x = x+y
       x -= y;  // x = x-y
   }
}
