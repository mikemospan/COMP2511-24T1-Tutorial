package exceptions;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest {
    public static void main(String[] args) {
        ExceptionTest exceptionTest = new ExceptionTest();
        String file = "text.txt";
        exceptionTest.readFile(file);
    }

    public void readFile(String fileName) {
        try {
            FileReader fileReader = new FileReader(fileName);
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }
    }
}
