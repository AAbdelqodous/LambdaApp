package p4.lamabda_variables;

public class TestInstanceVariable {
    private String instanceType = "scalar";
    public static void main(String[] args) {
        TestInstanceVariable testInstanceVariable = new TestInstanceVariable();
        testInstanceVariable.updateUsingInstanceVariable();
    }

    private void updateUsingInstanceVariable() {
        String locVarType = "java.util.String";
        // the variable must be effectively final
        VarInFuncInterface funcInterface = (variable) -> {
            System.out.println("Welcome to variable in a functional interface(" +variable+ "), of type: " +locVarType+
                    " which is a " +instanceType+ " data type.");
        };
        funcInterface.printId("x_var");

//        locVarType = "java.util.String";
        instanceType = "primitive";

        funcInterface.printId("x_var");
    }
}
