package p2.my_interface;

public class Test {
    public static void main(String[] args) {
        /* MyFunction function = (dev) -> {
            System.out.println("Welcome to functional interface, " +dev);
        }; */

        /* MyFunction function = dev -> System.out.println("Welcome to functional interface, " +dev);
        function.apply("Ahmed");*/

        MyFunction function =
                (devFName, devLName) -> System.out.println("Welcome to functional interface, " +devFName.concat(" ".concat(devLName)));
        function.apply("Ahmed", "Abdelqodous");
    }
}
