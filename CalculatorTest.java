public class CalculatorTest {
    public static void main(String[] args) {
        Calculator c = new Calculator();

        c.performOperation(10.5);
        c.performOperation("+");
        c.performOperation(5.2);
        c.performOperation("*");
        c.performOperation(10);
        c.performOperation("=");
        c.getResults();
    }
}