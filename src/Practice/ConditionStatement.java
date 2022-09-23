package Practice;

import java.sql.SQLOutput;

public class ConditionStatement {
    public static void main(String[] args) {
        int a = 55;
        int b = 70;
        if (a < 50) {
            System.out.println("a is less than 50");
        }
         else{
             System.out.println("50 is less than a");
          if (a<b) {
              System.out.println("a is less than b");
          }
           else{
               System.out.println("b is greater than a");
              }
        }
    }
}






