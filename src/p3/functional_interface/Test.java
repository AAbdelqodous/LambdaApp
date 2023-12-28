package p3.functional_interface;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;

public class Test {
    public static void main(String[] args) throws FileNotFoundException {
        /* FuncInterface funcInterface = (name) -> {
            System.out.println("Welcome to functional interface, " +name);
        }; */
        FuncInterface funcInterface = name -> System.out.println("Welcome to functional interface, " +name);
        funcInterface.printIt("Aliaa");

        funcInterface.printUtf8To("default function in a functional interface..",
                new FileOutputStream("C:\\Users\\ahmed.elsayed\\Documents\\java\\data.txt"));

        FuncInterface.printItToSystemOut("static methods in a functional interface..");
    }
}
