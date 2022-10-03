package Common;
/* print the pattern
        *
      * * *
    * * * * *
  * * * * * * *
 */

public class StarPattern10 {
    public static void main(String[] args) {
        int n =4;
        for (int i = 0; i<n; i++)
        {
            for(int j=n-i; j>1; j--)
            {
                System.out.print(" ");
            }
            for(int j=0; j<=2*i; j++){
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println();


    }

}






