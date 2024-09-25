import java.util.Scanner;

public class Menu{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Calculator calc = new Calculator();
        double num1, num2;

        System.out.println("-----------------------------------");
        System.out.println("        Simple Calculator");
        System.out.println("-----------------------------------\n");

        System.out.print("Enter first number: ");
        num1 = sc.nextDouble();
        calc.enterFirstNum(num1);   

        System.out.print("Enter second number: ");
        num2 = sc.nextDouble();
        calc.enterSecondNum(num2);

        System.out.println("\nChoose operation:");  
        System.out.println("1. Add (+)");
        System.out.println("2. Subtract (-)");
        System.out.println("3. Multiply (*)");
        System.out.println("4. Divide (/)");

        System.out.print("Operation (write the number): ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.println("\nResult: " + calc.add());
                break;
            case 2:
                System.out.println("\nResult: " + calc.subtract());
                break;
            case 3:
                System.out.println("\nResult: " + calc.multiply());
                break;
            case 4:
                System.out.println("\nResult: " + calc.divide());
                break;
            default:
                System.out.println("\nInvalid operation!");
        }

        System.out.println("-----------------------------------");

    }
    
}
