import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scan = new Scanner(System.in);
        double num1 = 0;
        double num2 = 0;
        String operator = "";
        String userPrompt = "continue";
        Calculator calc;
        double answer = 0;
    
        while(userPrompt.equals("continue")) {
            System.out.println("Please type the first number");
            num1 = scan.nextDouble();

            System.out.println( 
            "Choose an operation: \n" + 
            " > Type + for addition \n" + 
            " > Type - for subtraction \n" + 
            " > Type * for multiplication \n" +
            " > Type / for division");
            operator = scan.next();

            while (!isOperator(operator)){ 
                System.out.println("Please enter a valid operator");
                operator = scan.next();
            }

            System.out.println("Please type the second number");
            num2 = scan.nextDouble();

            if(operator.equals("/") && num2 == 0) {
                System.out.println("Cannot divide by zero");
            }
            else {
                calc = new Calculator(num1, num2, operator);
                answer = calc.calculate();
                System.out.println(num1 + " " + operator + " " + num2 + " = " + answer);
            }

            System.out.println("Do you want to continue or quit?");
            userPrompt = scan.next();

            while(!checkPrompt(userPrompt)) {
                System.out.println("Do you want to continue or quit?");
                userPrompt = scan.next();
            }

        } 

        System.out.println("Bye!");
        scan.close();
    }

    public static boolean isOperator(String operator) {
        return (operator.equals("+") || operator.equals("-") || operator.equals("*") || operator.equals("/")) ? true : false;
    }

    public static boolean checkPrompt(String userPrompt) {
        return (userPrompt.equals("continue") || userPrompt.equals("quit")) ? true : false;
    }
}
