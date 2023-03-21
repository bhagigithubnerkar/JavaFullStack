package javainterviewquestions;

public class ReverseNo {
    public static void main(String[] args) {
        int OriginalNo = 1993;
        int reversedNo = 0;
        int r = 0;
        while (OriginalNo != 0) {
            r = OriginalNo % 10;
            reversedNo = reversedNo * 10 + r;

            OriginalNo /= 10;
        }

        System.out.println("Reversed Number :" + (reversedNo));


    }
}
    
         
    
    
    
        

    

