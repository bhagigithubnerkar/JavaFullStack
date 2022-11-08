package Practice;

public class MaximumNo {
    public static void main(String[] args) {
        int a = 578;
        int b = 780;
        int c = 640;
        if(b >= a && b >= c){
            System.out.println("Maximum Number = " +(b));
        }
        else if(a >= b && a>= c){
            System.out.println("Maximum Number =" +(a));
        }
        else{
            System.out.println("Maximum Number =" +(c));

        }

    }
}
