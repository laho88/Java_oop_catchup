import java.util.ArrayList;

public class Calculator {
    ArrayList<String> operators = new ArrayList<String>();
    ArrayList<Double> nums = new ArrayList<Double>();
    private double results;

    // Constructor
    public Calculator() {}

    public void performOperation(double dd) {
        nums.add(dd);
    }

    public void performOperation(int dub) {
        nums.add((double) dub);
    }

    public void performOperation(String str) {
        if (str != "=") {
            operators.add(str);
        } else {
            Double start = nums.get(nums.size() - 1);
            for (int i = operators.size() - 1; i >= 0; i--) {
                switch (operators.get(i)) {
                case "+":
                    start = start + nums.get(i);
                    break;
                case "-":
                    start = start - nums.get(i);
                    break;
                case "*":
                    start = start * nums.get(i);
                    break;
                case "/":
                    start = start / nums.get(i);
                    break;
                default:
                    System.out.println("Invalid operator.");
                    break;
                }
            }
            this.results = start;
        }
    }
    public void getResults() {
        System.out.println(results);
    }
}