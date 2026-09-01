public class CalculatorTest {

    public static void main(String[] args) {

        Calculator c = new Calculator();

        // Test Case 1: Addition
        double result1 = c.add(10, 5);

        if (result1 == 15) {
            System.out.println("Test Case 1 - Addition: PASS");
        } else {
            System.out.println("Test Case 1 - Addition: FAIL");
        }


        // Test Case 2: Subtraction
        double result2 = c.subtract(10, 5);

        if (result2 == 5) {
            System.out.println("Test Case 2 - Subtraction: PASS");
        } else {
            System.out.println("Test Case 2 - Subtraction: FAIL");
        }


        // Test Case 3: Multiplication
        double result3 = c.multiply(10, 5);

        if (result3 == 50) {
            System.out.println("Test Case 3 - Multiplication: PASS");
        } else {
            System.out.println("Test Case 3 - Multiplication: FAIL");
        }


        // Test Case 4: Division
        double result4 = c.divide(10, 5);

        if (result4 == 2) {
            System.out.println("Test Case 4 - Division: PASS");
        } else {
            System.out.println("Test Case 4 - Division: FAIL");
        }
    }
}