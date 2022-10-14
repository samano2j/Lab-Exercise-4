public class Calculator {
    private double num1;
    private double num2;
    private String operator;

    public Calculator(double num1, double num2, String operator) {
        this.num1 = num1;
        this.num2 = num2;
        this.operator = operator;
    }

    public double calculate() {
        double answer = 0;

        if(operator.equals("+")) {
            answer = num1 + num2;
        }
        else if(operator.equals("-")) {
            answer = num1 - num2;
        }
        else if(operator.equals("*")) {
            answer = num1 * num2;
        }
        else if(operator.equals("/")) {
            answer = num1 / num2;
        }

        return answer;
    }

    
}
