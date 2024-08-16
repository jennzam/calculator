


import java.util.Scanner;

    public class Main {

    public static void main(String[] args) {

        boolean runAgain = true;

        while (runAgain){

            Scanner operationInput = new Scanner(System.in);
            System.out.println("Select an operation: +, -, /, *.");
            String operation = operationInput.nextLine();

            Scanner num1 = new Scanner(System.in);
            System.out.print("Enter the first number: ");
            double firstNumber = num1.nextDouble();

            Scanner num2 = new Scanner(System.in);
            System.out.print("Enter the second number: ");
            double secondNumber = num2.nextDouble();

            switch (operation){
                case "+": System.out.println(firstNumber + secondNumber); break;
                case "-": System.out.println(firstNumber - secondNumber); break;
                case "/": System.out.println(firstNumber / secondNumber); break;
                case "*": System.out.println(firstNumber * secondNumber); break;
                default:
                    System.out.println("No valid entry."); break;
            }
            Scanner askUser = new Scanner(System.in);
            System.out.println("Would you like to continue? Press Y or N: ");
            String answer = askUser.nextLine();
            if (answer.equalsIgnoreCase("Y")){
                runAgain = true;
            } else if (answer.equalsIgnoreCase("N")){
                runAgain = false;
            }
        }

    }
}