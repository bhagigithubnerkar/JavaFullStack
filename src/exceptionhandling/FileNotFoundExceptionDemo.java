package exceptionhandling;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FileNotFoundExceptionDemo {
    public static void main(String[] args) {
        try {
            PrintWriter printWriter = new PrintWriter("input.txt");
            printWriter.print("Welcome");
            printWriter.close();

        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
        System.out.println("File Saved");
    }
}
