import java.util.Scanner;

class Calculator{
     public static void main(String[] args){
           
         Scanner sc = new Scanner(System.in);

         System.out.print("First number: ");
         int num1 = sc.nextInt();

         System.out.print("Second number: ");
         int num2 = sc.nextInt();

        System.out.print("Enter an operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);

        double result = 0;
        boolean validOperation = true;

         switch (operator) {
            case '+':
                result = num1 + num2;
                System.out.println("Result: " + result);
                break;

            case '-':
                result = num1 - num2;
                System.out.println("Result: " + result);
                break;

            case '*':
                result = num1 * num2;
                System.out.println("Result: " + result);
                break;

            case '/':
               
                if (num2 == 0) {
                    System.out.println("Error: Division by zero is not allowed.");
                } else {
                    result = num1 / num2;
                    System.out.println("Result: " + result);
                }
                break;
            default:
                System.out.println("Error: Invalid operator.");
        }
    }
}
        


