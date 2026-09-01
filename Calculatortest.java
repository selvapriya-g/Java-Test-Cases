public class CalculatorTest {

    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        // TC01
        double result1 = calculator.add(5.0, 3.0);

        if (result1 == 8.0) {
            System.out.println("TC01 PASS");
        } else {
            System.out.println("TC01 FAIL - Expected: 8.0, Actual: " + result1);
        }


        // TC02
        double result2 = calculator.add(-5.0, -3.0);

        if (result2 == -8.0) {
            System.out.println("TC02 PASS");
        } else {
            System.out.println("TC02 FAIL - Expected: -8.0, Actual: " + result2);
        }


        // TC03 - Expected value intentionally changed
        double result3 = calculator.add(0.0, 5.5);

        if (result3 == 6.0) {
            System.out.println("TC03 PASS");
        } else {
            System.out.println("TC03 FAIL - Expected: 6.0, Actual: " + result3);
        }


        System.out.println("--------------------------------");
        System.out.println("Test completed by: Selvapriya");
        System.out.println("--------------------------------");
    }
}