package p4.lamabda_variables;

public class Test {
    static String staticType = "scalar";
    public static void main(String[] args) {
        String locVarType = "java.util.String";
        // the variable must be effectively final
        VarInFuncInterface funcInterface = (variable) -> {
//            String varType = "java.util.String";
            System.out.println("Welcome to variable in a functional interface(" +variable+ "), of type: " +locVarType+
                    " which is a " +staticType+ " data type.");
        };
        funcInterface.printId("x_var");

//        locVarType = "java.util.String";
        staticType = "primitive";

        funcInterface.printId("x_var");
    }
}
