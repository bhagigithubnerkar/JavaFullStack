package filehandling;

import java.io.File;
import java.io.IOException;

public class FileDemo {
    public static void main(String[] args) {
        File file = new File("Demo.txt");
        try {
            if (file.createNewFile()) {
                System.out.println("File Created");
                System.out.println("File Name" + file.getName());
                System.out.println("Absolute Path" + file.getAbsolutePath());
                System.out.println("is file" + file.isFile());
                System.out.println("can Read" + file.canRead());
                System.out.println("can Write" + file.canWrite());
                System.out.println("can Execute" + file.canExecute());
                System.out.println("Length" + file.length());
            } else {
                System.out.println("File Already Exists");
            }

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


