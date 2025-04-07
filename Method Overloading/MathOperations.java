public class MathOperations {


    public int add(int a, int b) {
        return a + b;
    }

    public double add(double a, double b) {
        return a + b;
    }


    public int subtract(int a, int b) {
        return a - b;
    }

    public double subtract(double a, double b) {
        return a - b;
    }


    public int multiply(int a, int b) {
        return a * b;
    }

    public double multiply(double a, double b) {
        return a * b;
    }


    public int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero not allowed.");
        }
        return a / b;
    }

    public double divide(double a, double b) {
        if (b == 0.0) {
            throw new ArithmeticException("Division by zero not allowed.");
        }
        return a / b;
    }


    public static void main(String[] args) {
        MathOperations mo = new MathOperations();


        System.out.println("Int Add: " + mo.add(5, 3));
        System.out.println("Int Subtract: " + mo.subtract(10, 4));
        System.out.println("Int Multiply: " + mo.multiply(2, 3));
        System.out.println("Int Divide: " + mo.divide(10, 2));


        System.out.println("Double Add: " + mo.add(5.5, 3.2));
        System.out.println("Double Subtract: " + mo.subtract(10.5, 4.2));
        System.out.println("Double Multiply: " + mo.multiply(2.5, 3.0));
        System.out.println("Double Divide: " + mo.divide(10.0, 2.5));
    }
}
