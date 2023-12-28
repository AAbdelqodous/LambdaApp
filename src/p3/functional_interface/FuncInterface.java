package p3.functional_interface;

import java.io.IOException;
import java.io.OutputStream;

public interface FuncInterface {
    void printIt(String text);

    default void printUtf8To(String text, OutputStream outputStream){
        try {
            outputStream.write(text.getBytes("UTF-8"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    static void printItToSystemOut(String text){
        System.out.println(text);
    }
}
