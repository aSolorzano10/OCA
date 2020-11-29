package lambdas;

public class LambdasOne {

    public static void main(String[] args) {

        IOperation sum = (int a, int b) -> {return (a + b); };
        System.out.println("Sum: " + sum.operation(3,2));

        IOperation rest = (a, b) -> a-b;
        System.out.println("Rest: " + rest.operation(5,2));

        IOperation multiplication = (a,b) -> (a*b);
        System.out.println("Multiplication: " + multiplication.operation(3, 3));

        IOperation division = (a,b) -> { int result = a/b;
        return result;};
        System.out.println("Division: " + division.operation(10, 2));

    }
}
