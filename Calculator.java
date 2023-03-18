//Ameer Ahmed

public class Main {

    public static int calculator(int num1, char operator, int num2) {

        switch(operator) {

            case '+':
            return num1 + num2;

            case '-':
            return num1 - num2;

            case '*':
            return num1 * num2;
        
            case '/':
                if (num2 == 0) { 
                return 0;
                }

                else {
                return num1 / num2;
                }            
        default:
            return 0;
        }
    }

    public static void main(String[] args) {
        System.out.println("Addition: " + calculator(2, '+', 4));
        System.out.println("Subtraction: " + calculator(10, '-', 5));
        System.out.println("Multiplication: " + calculator(2, '*', 4));
        System.out.println("Dividing by zero: " + calculator(2, '/', 0));
        System.out.println("Division: " +  calculator(8, '/', 2));
    }
}