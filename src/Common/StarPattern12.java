package Common;
/* print the pattern
            *
           *
          *
         *
        *
*/
public class StarPattern12 {
    public static void main(String[] args) {
        int n = 4;
        for (int i =1; i<=n; i++)
        {
            for(int j =4; j>i; j--)
            {
                System.out.print(" ");
            }
            for(int j =1; j<=i; j++){
            if(i>=2 && j>1)
            {
                System.out.print(" ");
            }
            else
            {
                System.out.print("*");
            }
            }
            System.out.println();
        }


    }
}
