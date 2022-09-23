package Common;

public class Operators{
   public static void main(String args[]){
       // Unary Operator;
       int a=15;
       System.out.println(a++);  //15
       System.out.println(++a);  //17
       System.out.println(a--);  //17
       System.out.println(--a);  //15

       System.out.println(a++ + ++a);  //15 + 17 = 32
       int b = 10;
       int c = -10;
       System.out.println(-b); //(-b)-1 = -10-1 = -11
       System.out.println(-c); //(-c)-1 = 10-1 = 9

       boolean isFlag = false;
       System.out.println(isFlag);
       b = 20;
       a = 10;
       System.out.println(a+b); //30
       System.out.println(b-a); //10
       System.out.println(b*a); //200
       System.out.println(b/a); //2
   }
}
