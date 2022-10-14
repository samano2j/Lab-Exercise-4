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
            answer = add();
        }
        else if(operator.equals("-")) {
            answer = subtract();
        }
        else if(operator.equals("*")) {
            answer = multiply();
        }
        else if(operator.equals("/")) {
            answer = divide();
        }
        
        return answer;
    }

    public double add() {
        return num1 + num2;
    }

    public double subtract() {
        return num1 - num2;
    }

    public double multiply() {
        return num1 * num2;
    }

    public double divide() {
        return num1 / num2;
    }

    
}
